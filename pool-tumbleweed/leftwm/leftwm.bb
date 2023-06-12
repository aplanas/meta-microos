SUMMARY = "A tiling window manager for adventurers"
DESCRIPTION = "LeftWM is a tiling window manager written in Rust that aims to be stable and performant."
LICENSE = "Apache-2.0 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | MPL-2.0) & BSD-2-Clause & BSD-3-Clause & (MIT | Unlicense)"

PV = "0.4.0+git56"

RPM_NAME = "leftwm-0.4.0+git56-1.2.aarch64.rpm"
RPM_HASH = "474d61525a948157057d54c2cdd11c1bfad53668324e1ab36031b32169aa272559baf4d2a16cbe7ab2c2aaa89276b3b8fd089fa5e237b6d0489a93891c1c57e8"

RPROVIDES:${PN} += "bundled(rust-crate:aho-corasick) \
bundled(rust-crate:anyhow) \
bundled(rust-crate:anymap2) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:base64) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:block-buffer) \
bundled(rust-crate:bytes) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:const_format) \
bundled(rust-crate:const_format_proc_macros) \
bundled(rust-crate:cpufeatures) \
bundled(rust-crate:crypto-common) \
bundled(rust-crate:digest) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-next) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:dirs-sys-next) \
bundled(rust-crate:doc-comment) \
bundled(rust-crate:either) \
bundled(rust-crate:futures) \
bundled(rust-crate:futures-channel) \
bundled(rust-crate:futures-core) \
bundled(rust-crate:futures-executor) \
bundled(rust-crate:futures-io) \
bundled(rust-crate:futures-macro) \
bundled(rust-crate:futures-sink) \
bundled(rust-crate:futures-task) \
bundled(rust-crate:futures-util) \
bundled(rust-crate:generic-array) \
bundled(rust-crate:git-version) \
bundled(rust-crate:git-version-macro) \
bundled(rust-crate:io-lifetimes) \
bundled(rust-crate:is-terminal) \
bundled(rust-crate:itertools) \
bundled(rust-crate:itoa) \
bundled(rust-crate:kstring) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:lefthk-core) \
bundled(rust-crate:leftwm) \
bundled(rust-crate:leftwm-core) \
bundled(rust-crate:libc) \
bundled(rust-crate:linux-raw-sys) \
bundled(rust-crate:liquid) \
bundled(rust-crate:liquid-core) \
bundled(rust-crate:liquid-derive) \
bundled(rust-crate:liquid-lib) \
bundled(rust-crate:log) \
bundled(rust-crate:matchers) \
bundled(rust-crate:memchr) \
bundled(rust-crate:memoffset) \
bundled(rust-crate:mio) \
bundled(rust-crate:nix) \
bundled(rust-crate:nu-ansi-term) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:num_cpus) \
bundled(rust-crate:num_threads) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:os_str_bytes) \
bundled(rust-crate:overload) \
bundled(rust-crate:percent-encoding) \
bundled(rust-crate:pest) \
bundled(rust-crate:pest_derive) \
bundled(rust-crate:pest_generator) \
bundled(rust-crate:pest_meta) \
bundled(rust-crate:pin-project-lite) \
bundled(rust-crate:pin-utils) \
bundled(rust-crate:pkg-config) \
bundled(rust-crate:proc-macro-hack) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:proc-quote) \
bundled(rust-crate:proc-quote-impl) \
bundled(rust-crate:quote) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-automata) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:ron) \
bundled(rust-crate:rustix) \
bundled(rust-crate:ryu) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:sha2) \
bundled(rust-crate:sharded-slab) \
bundled(rust-crate:shellexpand) \
bundled(rust-crate:signal-hook) \
bundled(rust-crate:signal-hook-registry) \
bundled(rust-crate:slab) \
bundled(rust-crate:smallvec) \
bundled(rust-crate:socket2) \
bundled(rust-crate:static_assertions) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:thread_local) \
bundled(rust-crate:time) \
bundled(rust-crate:time-core) \
bundled(rust-crate:time-macros) \
bundled(rust-crate:tokio) \
bundled(rust-crate:tokio-macros) \
bundled(rust-crate:toml) \
bundled(rust-crate:tracing) \
bundled(rust-crate:tracing-attributes) \
bundled(rust-crate:tracing-core) \
bundled(rust-crate:tracing-journald) \
bundled(rust-crate:tracing-log) \
bundled(rust-crate:tracing-subscriber) \
bundled(rust-crate:typenum) \
bundled(rust-crate:ucd-trie) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-segmentation) \
bundled(rust-crate:unicode-xid) \
bundled(rust-crate:version_check) \
bundled(rust-crate:x11-dl) \
bundled(rust-crate:xdg) \
bundled(rust-crate:xlib-display-server) \
leftwm \
leftwm(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm