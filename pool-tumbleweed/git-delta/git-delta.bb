SUMMARY = "A syntax-highlighter for git and diff output"
DESCRIPTION = "Delta provides language syntax-highlighting, within-line insertion/deletion detection, and restructured diff output for git on the command line."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "git-delta-0.15.1-1.3.aarch64.rpm"
RPM_HASH = "59c2b569fe9c9418805be70f79b96ff2627f94b55e894e0f9227c4ff97cf8341f8bcb603ec585ce65dbf372b806882150a9c5b8c7812e2cc5bbbb19015d88ca0"

RPROVIDES:${PN} += "bundled(rust-crate:adler) \
bundled(rust-crate:aho-corasick) \
bundled(rust-crate:ansi_colours) \
bundled(rust-crate:ansi_term) \
bundled(rust-crate:approx) \
bundled(rust-crate:arrayvec) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:base64) \
bundled(rust-crate:bat) \
bundled(rust-crate:bincode) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:box_drawing) \
bundled(rust-crate:bstr) \
bundled(rust-crate:bytelines) \
bundled(rust-crate:bytemuck) \
bundled(rust-crate:bytes) \
bundled(rust-crate:bytesize) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:chrono) \
bundled(rust-crate:chrono-humanize) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_derive) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:clircle) \
bundled(rust-crate:console) \
bundled(rust-crate:content_inspector) \
bundled(rust-crate:crc32fast) \
bundled(rust-crate:ctrlc) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-next) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:dirs-sys-next) \
bundled(rust-crate:either) \
bundled(rust-crate:encoding) \
bundled(rust-crate:encoding-index-japanese) \
bundled(rust-crate:encoding-index-korean) \
bundled(rust-crate:encoding-index-simpchinese) \
bundled(rust-crate:encoding-index-singlebyte) \
bundled(rust-crate:encoding-index-tradchinese) \
bundled(rust-crate:encoding_index_tests) \
bundled(rust-crate:error-chain) \
bundled(rust-crate:find-crate) \
bundled(rust-crate:flate2) \
bundled(rust-crate:fnv) \
bundled(rust-crate:form_urlencoded) \
bundled(rust-crate:futures) \
bundled(rust-crate:futures-channel) \
bundled(rust-crate:futures-core) \
bundled(rust-crate:futures-executor) \
bundled(rust-crate:futures-io) \
bundled(rust-crate:futures-macro) \
bundled(rust-crate:futures-sink) \
bundled(rust-crate:futures-task) \
bundled(rust-crate:futures-util) \
bundled(rust-crate:git-delta) \
bundled(rust-crate:git2) \
bundled(rust-crate:globset) \
bundled(rust-crate:grep-cli) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:heck) \
bundled(rust-crate:iana-time-zone) \
bundled(rust-crate:idna) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:itertools) \
bundled(rust-crate:itoa) \
bundled(rust-crate:jobserver) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:libgit2-sys) \
bundled(rust-crate:libz-sys) \
bundled(rust-crate:line-wrap) \
bundled(rust-crate:linked-hash-map) \
bundled(rust-crate:log) \
bundled(rust-crate:memchr) \
bundled(rust-crate:miniz_oxide) \
bundled(rust-crate:nix) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:onig) \
bundled(rust-crate:onig_sys) \
bundled(rust-crate:os_str_bytes) \
bundled(rust-crate:palette) \
bundled(rust-crate:palette_derive) \
bundled(rust-crate:path_abs) \
bundled(rust-crate:pathdiff) \
bundled(rust-crate:percent-encoding) \
bundled(rust-crate:phf) \
bundled(rust-crate:phf_generator) \
bundled(rust-crate:phf_macros) \
bundled(rust-crate:phf_shared) \
bundled(rust-crate:pin-project-lite) \
bundled(rust-crate:pin-utils) \
bundled(rust-crate:pkg-config) \
bundled(rust-crate:plist) \
bundled(rust-crate:proc-macro-error) \
bundled(rust-crate:proc-macro-error-attr) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:rand) \
bundled(rust-crate:rand_core) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-automata) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:rgb) \
bundled(rust-crate:ryu) \
bundled(rust-crate:safemem) \
bundled(rust-crate:same-file) \
bundled(rust-crate:semver) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:serde_yaml) \
bundled(rust-crate:shell-words) \
bundled(rust-crate:siphasher) \
bundled(rust-crate:slab) \
bundled(rust-crate:smol_str) \
bundled(rust-crate:static_assertions) \
bundled(rust-crate:std_prelude) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:syntect) \
bundled(rust-crate:sysinfo) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:terminal_size) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:time) \
bundled(rust-crate:time-core) \
bundled(rust-crate:time-macros) \
bundled(rust-crate:tinyvec) \
bundled(rust-crate:tinyvec_macros) \
bundled(rust-crate:tokio) \
bundled(rust-crate:toml) \
bundled(rust-crate:unicode-bidi) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-normalization) \
bundled(rust-crate:unicode-segmentation) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:url) \
bundled(rust-crate:utf8parse) \
bundled(rust-crate:version_check) \
bundled(rust-crate:vte) \
bundled(rust-crate:vte_generate_state_changes) \
bundled(rust-crate:walkdir) \
bundled(rust-crate:xdg) \
bundled(rust-crate:xml-rs) \
bundled(rust-crate:yaml-rust) \
git-delta \
git-delta(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm