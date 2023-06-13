SUMMARY = "Fast network port scanner"
DESCRIPTION = "Find all open ports fast with RustScan, then automatically \
pipe them into Nmap."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1+0"

RPM_NAME = "rustscan-2.1.1+0-1.3.aarch64.rpm"
RPM_HASH = "539ab900cf539fd53e8aaf69a2a0f95d5fad770818e80559f4fb8bdfbfd89444affa0b380a6c3764f6c068294d357e8db023a03a84ff3d3faeadbbe64254a18d"

RPROVIDES:${PN} += "bundled(rust-crate:addr2line) \
bundled(rust-crate:adler) \
bundled(rust-crate:aho-corasick) \
bundled(rust-crate:ansi_term) \
bundled(rust-crate:anyhow) \
bundled(rust-crate:async-channel) \
bundled(rust-crate:async-executor) \
bundled(rust-crate:async-global-executor) \
bundled(rust-crate:async-io) \
bundled(rust-crate:async-lock) \
bundled(rust-crate:async-std) \
bundled(rust-crate:async-task) \
bundled(rust-crate:async-trait) \
bundled(rust-crate:atomic-waker) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:backtrace) \
bundled(rust-crate:base64) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:blocking) \
bundled(rust-crate:bytes) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:cidr-utils) \
bundled(rust-crate:clap) \
bundled(rust-crate:colored) \
bundled(rust-crate:colorful) \
bundled(rust-crate:concurrent-queue) \
bundled(rust-crate:crossbeam-utils) \
bundled(rust-crate:ctor) \
bundled(rust-crate:debug-helper) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:either) \
bundled(rust-crate:enum-as-inner) \
bundled(rust-crate:env_logger) \
bundled(rust-crate:event-listener) \
bundled(rust-crate:fastrand) \
bundled(rust-crate:form_urlencoded) \
bundled(rust-crate:futures) \
bundled(rust-crate:futures-channel) \
bundled(rust-crate:futures-core) \
bundled(rust-crate:futures-executor) \
bundled(rust-crate:futures-io) \
bundled(rust-crate:futures-lite) \
bundled(rust-crate:futures-macro) \
bundled(rust-crate:futures-sink) \
bundled(rust-crate:futures-task) \
bundled(rust-crate:futures-util) \
bundled(rust-crate:gcd) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:gimli) \
bundled(rust-crate:heck) \
bundled(rust-crate:hostname) \
bundled(rust-crate:humantime) \
bundled(rust-crate:idna) \
bundled(rust-crate:iovec) \
bundled(rust-crate:itertools) \
bundled(rust-crate:itoa) \
bundled(rust-crate:kv-log-macro) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:linked-hash-map) \
bundled(rust-crate:log) \
bundled(rust-crate:lru-cache) \
bundled(rust-crate:match_cfg) \
bundled(rust-crate:matches) \
bundled(rust-crate:memchr) \
bundled(rust-crate:miniz_oxide) \
bundled(rust-crate:mio) \
bundled(rust-crate:net2) \
bundled(rust-crate:num-bigint) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:object) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:parking) \
bundled(rust-crate:percent-encoding) \
bundled(rust-crate:pin-project-lite) \
bundled(rust-crate:pin-utils) \
bundled(rust-crate:polling) \
bundled(rust-crate:ppv-lite86) \
bundled(rust-crate:proc-macro-error) \
bundled(rust-crate:proc-macro-error-attr) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quick-error) \
bundled(rust-crate:quote) \
bundled(rust-crate:rand) \
bundled(rust-crate:rand_chacha) \
bundled(rust-crate:rand_core) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:resolv-conf) \
bundled(rust-crate:ring) \
bundled(rust-crate:rlimit) \
bundled(rust-crate:rustc-demangle) \
bundled(rust-crate:rustls) \
bundled(rust-crate:rustscan) \
bundled(rust-crate:ryu) \
bundled(rust-crate:sct) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:shell-words) \
bundled(rust-crate:slab) \
bundled(rust-crate:smallvec) \
bundled(rust-crate:socket2) \
bundled(rust-crate:spin) \
bundled(rust-crate:strsim) \
bundled(rust-crate:structopt) \
bundled(rust-crate:structopt-derive) \
bundled(rust-crate:subprocess) \
bundled(rust-crate:syn) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:text_placeholder) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:tinyvec) \
bundled(rust-crate:tinyvec_macros) \
bundled(rust-crate:tokio) \
bundled(rust-crate:tokio-rustls) \
bundled(rust-crate:toml) \
bundled(rust-crate:trust-dns-proto) \
bundled(rust-crate:trust-dns-resolver) \
bundled(rust-crate:trust-dns-rustls) \
bundled(rust-crate:unicode-bidi) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-normalization) \
bundled(rust-crate:unicode-segmentation) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:untrusted) \
bundled(rust-crate:url) \
bundled(rust-crate:value-bag) \
bundled(rust-crate:vec_map) \
bundled(rust-crate:version_check) \
bundled(rust-crate:waker-fn) \
bundled(rust-crate:webpki) \
bundled(rust-crate:webpki-roots) \
rustscan \
rustscan(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
nmap"

inherit rpm
