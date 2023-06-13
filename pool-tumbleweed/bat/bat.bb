SUMMARY = "A cat(1) clone with syntax highlighting and Git integration"
DESCRIPTION = "A cat(1) clone which supports syntax highlighting for a large number of \
programming and markup languages. It has git integration and automatic paging."
LICENSE = "Apache-2.0 | MIT"

PV = "0.23.0"

RPM_NAME = "bat-0.23.0-1.1.aarch64.rpm"
RPM_HASH = "9992746d5397ff9c67388b563870d101f6de51435d00768d93090839208e0851d3313db996a2be74b94af28d7a9525129b40d32be356561b40ebd01fdf6a27bb"

RPROVIDES:${PN} += "bat \
bat(aarch-64) \
bundled(rust-crate:adler) \
bundled(rust-crate:aho-corasick) \
bundled(rust-crate:ansi_colours) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:base64) \
bundled(rust-crate:bat) \
bundled(rust-crate:bincode) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:bstr) \
bundled(rust-crate:bugreport) \
bundled(rust-crate:bytemuck) \
bundled(rust-crate:bytesize) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:clircle) \
bundled(rust-crate:console) \
bundled(rust-crate:content_inspector) \
bundled(rust-crate:crc32fast) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:encoding) \
bundled(rust-crate:encoding-index-japanese) \
bundled(rust-crate:encoding-index-korean) \
bundled(rust-crate:encoding-index-simpchinese) \
bundled(rust-crate:encoding-index-singlebyte) \
bundled(rust-crate:encoding-index-tradchinese) \
bundled(rust-crate:encoding_index_tests) \
bundled(rust-crate:flate2) \
bundled(rust-crate:fnv) \
bundled(rust-crate:form_urlencoded) \
bundled(rust-crate:git-version) \
bundled(rust-crate:git-version-macro) \
bundled(rust-crate:git2) \
bundled(rust-crate:globset) \
bundled(rust-crate:grep-cli) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:idna) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:io-lifetimes) \
bundled(rust-crate:is-terminal) \
bundled(rust-crate:itoa) \
bundled(rust-crate:jobserver) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:libgit2-sys) \
bundled(rust-crate:libz-sys) \
bundled(rust-crate:line-wrap) \
bundled(rust-crate:linked-hash-map) \
bundled(rust-crate:linux-raw-sys) \
bundled(rust-crate:log) \
bundled(rust-crate:memchr) \
bundled(rust-crate:miniz_oxide) \
bundled(rust-crate:nu-ansi-term) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:onig) \
bundled(rust-crate:onig_sys) \
bundled(rust-crate:os_str_bytes) \
bundled(rust-crate:path_abs) \
bundled(rust-crate:percent-encoding) \
bundled(rust-crate:pkg-config) \
bundled(rust-crate:plist) \
bundled(rust-crate:proc-macro-hack) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quick-xml) \
bundled(rust-crate:quote) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-automata) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:rgb) \
bundled(rust-crate:rustix) \
bundled(rust-crate:ryu) \
bundled(rust-crate:safemem) \
bundled(rust-crate:same-file) \
bundled(rust-crate:semver) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:serde_yaml) \
bundled(rust-crate:shell-escape) \
bundled(rust-crate:shell-words) \
bundled(rust-crate:std_prelude) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:syntect) \
bundled(rust-crate:sys-info) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:terminal_size) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:time) \
bundled(rust-crate:time-core) \
bundled(rust-crate:time-macros) \
bundled(rust-crate:tinyvec) \
bundled(rust-crate:tinyvec_macros) \
bundled(rust-crate:unicode-bidi) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-normalization) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:url) \
bundled(rust-crate:walkdir) \
bundled(rust-crate:wild) \
bundled(rust-crate:yaml-rust)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
