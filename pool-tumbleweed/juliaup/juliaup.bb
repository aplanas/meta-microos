SUMMARY = "Julia installer and version multiplexer"
DESCRIPTION = "A cross-platform installer for the Julia programming language. \
 \
The installer also bundles a full Julia version manager called juliaup. \
One can use juliaup to install specific Julia versions, it alerts users \
when new Julia versions are released and provides a convenient Julia \
release channel abstraction."
LICENSE = "(0BSD | MIT | Apache-2.0) & Apache-2.0 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-WITH-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & ISC & MIT & MPL-2.0 & MIT"

PV = "1.8.16"

RPM_NAME = "juliaup-1.8.16-1.2.aarch64.rpm"
RPM_HASH = "12bed37a44f010106b08c8451ca65942084b4e60b8f9554f46077e2bac017b78c794213d1cdad7f2321d35f89360b4261d24a7210bef0cf0afe06fde01c9e09f"

RPROVIDES:${PN} += "bundled(rust-crate:addr2line) \
bundled(rust-crate:adler) \
bundled(rust-crate:aho-corasick) \
bundled(rust-crate:anyhow) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:backtrace) \
bundled(rust-crate:base64) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:bstr) \
bundled(rust-crate:built) \
bundled(rust-crate:cargo-lock) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:chrono) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_derive) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:cli-table) \
bundled(rust-crate:cli-table-derive) \
bundled(rust-crate:cluFlock) \
bundled(rust-crate:console) \
bundled(rust-crate:crc32fast) \
bundled(rust-crate:csv) \
bundled(rust-crate:csv-core) \
bundled(rust-crate:ctrlc) \
bundled(rust-crate:dialoguer) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:either) \
bundled(rust-crate:env_logger) \
bundled(rust-crate:env_proxy) \
bundled(rust-crate:fastrand) \
bundled(rust-crate:filetime) \
bundled(rust-crate:flate2) \
bundled(rust-crate:foreign-types) \
bundled(rust-crate:foreign-types-shared) \
bundled(rust-crate:form_urlencoded) \
bundled(rust-crate:fs_extra) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:gimli) \
bundled(rust-crate:heck) \
bundled(rust-crate:human-panic) \
bundled(rust-crate:humantime) \
bundled(rust-crate:iana-time-zone) \
bundled(rust-crate:idna) \
bundled(rust-crate:indicatif) \
bundled(rust-crate:indoc) \
bundled(rust-crate:io-lifetimes) \
bundled(rust-crate:is-terminal) \
bundled(rust-crate:itertools) \
bundled(rust-crate:itoa) \
bundled(rust-crate:juliaup) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:linux-raw-sys) \
bundled(rust-crate:log) \
bundled(rust-crate:memchr) \
bundled(rust-crate:memoffset) \
bundled(rust-crate:miniz_oxide) \
bundled(rust-crate:native-tls) \
bundled(rust-crate:nix) \
bundled(rust-crate:normpath) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:number_prefix) \
bundled(rust-crate:object) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:openssl) \
bundled(rust-crate:openssl-macros) \
bundled(rust-crate:openssl-probe) \
bundled(rust-crate:openssl-sys) \
bundled(rust-crate:os_str_bytes) \
bundled(rust-crate:os_type) \
bundled(rust-crate:percent-encoding) \
bundled(rust-crate:pin-utils) \
bundled(rust-crate:pkg-config) \
bundled(rust-crate:portable-atomic) \
bundled(rust-crate:proc-macro-error) \
bundled(rust-crate:proc-macro-error-attr) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-automata) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:remove_dir_all) \
bundled(rust-crate:ring) \
bundled(rust-crate:rustc-demangle) \
bundled(rust-crate:rustix) \
bundled(rust-crate:rustls) \
bundled(rust-crate:rustls-native-certs) \
bundled(rust-crate:rustls-pemfile) \
bundled(rust-crate:ryu) \
bundled(rust-crate:sct) \
bundled(rust-crate:semver) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:shellexpand) \
bundled(rust-crate:spin) \
bundled(rust-crate:static_assertions) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:tar) \
bundled(rust-crate:tempfile) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:time) \
bundled(rust-crate:tinyvec) \
bundled(rust-crate:tinyvec_macros) \
bundled(rust-crate:toml) \
bundled(rust-crate:unicode-bidi) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-normalization) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:untrusted) \
bundled(rust-crate:ureq) \
bundled(rust-crate:url) \
bundled(rust-crate:uuid) \
bundled(rust-crate:version_check) \
bundled(rust-crate:webpki) \
bundled(rust-crate:webpki-roots) \
bundled(rust-crate:xattr) \
bundled(rust-crate:zeroize) \
juliaup \
juliaup(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit)"

inherit rpm
