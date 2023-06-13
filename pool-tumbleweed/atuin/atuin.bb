SUMMARY = "Magical shell history"
DESCRIPTION = "Atuin replaces your existing shell history with a SQLite database, and records additional context for your commands. \
Additionally, it provides optional and fully encrypted synchronisation of your history between machines, via an Atuin server."
LICENSE = "MIT"

PV = "14.0.1"

RPM_NAME = "atuin-14.0.1-1.1.aarch64.rpm"
RPM_HASH = "9d5c4bd37baa6562f96521ebfe17207b96d2c39db4bdf5af4f3c7fcc13ed62e76595ac7fd967db01eebef3ca965d84fc787cb40159502e0d24a6e291e43d98c9"

RPROVIDES:${PN} += "atuin \
atuin(aarch-64) \
bundled(rust-crate:ahash) \
bundled(rust-crate:aho-corasick) \
bundled(rust-crate:anstream) \
bundled(rust-crate:anstyle) \
bundled(rust-crate:anstyle-parse) \
bundled(rust-crate:anstyle-query) \
bundled(rust-crate:anyhow) \
bundled(rust-crate:async-trait) \
bundled(rust-crate:atoi) \
bundled(rust-crate:atty) \
bundled(rust-crate:atuin) \
bundled(rust-crate:atuin-client) \
bundled(rust-crate:atuin-common) \
bundled(rust-crate:atuin-server) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:axum) \
bundled(rust-crate:axum-core) \
bundled(rust-crate:base64) \
bundled(rust-crate:beef) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:block-buffer) \
bundled(rust-crate:byteorder) \
bundled(rust-crate:bytes) \
bundled(rust-crate:cassowary) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:chrono) \
bundled(rust-crate:chronoutil) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_builder) \
bundled(rust-crate:clap_complete) \
bundled(rust-crate:clap_derive) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:colorchoice) \
bundled(rust-crate:colored) \
bundled(rust-crate:config) \
bundled(rust-crate:console) \
bundled(rust-crate:cpufeatures) \
bundled(rust-crate:crc) \
bundled(rust-crate:crc-catalog) \
bundled(rust-crate:crossbeam-channel) \
bundled(rust-crate:crossbeam-queue) \
bundled(rust-crate:crossbeam-utils) \
bundled(rust-crate:crossterm) \
bundled(rust-crate:crypto-common) \
bundled(rust-crate:digest) \
bundled(rust-crate:directories) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:dotenvy) \
bundled(rust-crate:ed25519) \
bundled(rust-crate:either) \
bundled(rust-crate:encoding_rs) \
bundled(rust-crate:env_logger) \
bundled(rust-crate:event-listener) \
bundled(rust-crate:eyre) \
bundled(rust-crate:filedescriptor) \
bundled(rust-crate:flume) \
bundled(rust-crate:fnv) \
bundled(rust-crate:form_urlencoded) \
bundled(rust-crate:fs-err) \
bundled(rust-crate:futures-channel) \
bundled(rust-crate:futures-core) \
bundled(rust-crate:futures-executor) \
bundled(rust-crate:futures-intrusive) \
bundled(rust-crate:futures-macro) \
bundled(rust-crate:futures-sink) \
bundled(rust-crate:futures-task) \
bundled(rust-crate:futures-util) \
bundled(rust-crate:fuzzy-matcher) \
bundled(rust-crate:generic-array) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:h2) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:hashlink) \
bundled(rust-crate:heck) \
bundled(rust-crate:hex) \
bundled(rust-crate:hkdf) \
bundled(rust-crate:hmac) \
bundled(rust-crate:http) \
bundled(rust-crate:http-body) \
bundled(rust-crate:http-range-header) \
bundled(rust-crate:httparse) \
bundled(rust-crate:httpdate) \
bundled(rust-crate:humantime) \
bundled(rust-crate:hyper) \
bundled(rust-crate:hyper-rustls) \
bundled(rust-crate:iana-time-zone) \
bundled(rust-crate:idna) \
bundled(rust-crate:indenter) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:indicatif) \
bundled(rust-crate:instant) \
bundled(rust-crate:interim) \
bundled(rust-crate:io-lifetimes) \
bundled(rust-crate:ipnet) \
bundled(rust-crate:is-terminal) \
bundled(rust-crate:itertools) \
bundled(rust-crate:itoa) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:libsodium-sys) \
bundled(rust-crate:libsqlite3-sys) \
bundled(rust-crate:linux-raw-sys) \
bundled(rust-crate:lock_api) \
bundled(rust-crate:log) \
bundled(rust-crate:logos) \
bundled(rust-crate:logos-derive) \
bundled(rust-crate:matchers) \
bundled(rust-crate:matchit) \
bundled(rust-crate:md-5) \
bundled(rust-crate:memchr) \
bundled(rust-crate:mime) \
bundled(rust-crate:minimal-lexical) \
bundled(rust-crate:minspan) \
bundled(rust-crate:mio) \
bundled(rust-crate:nom) \
bundled(rust-crate:nu-ansi-term) \
bundled(rust-crate:num) \
bundled(rust-crate:num-bigint) \
bundled(rust-crate:num-complex) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-iter) \
bundled(rust-crate:num-rational) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:num_cpus) \
bundled(rust-crate:number_prefix) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:openssl-probe) \
bundled(rust-crate:overload) \
bundled(rust-crate:parking_lot) \
bundled(rust-crate:parking_lot_core) \
bundled(rust-crate:parse_duration) \
bundled(rust-crate:paste) \
bundled(rust-crate:pathdiff) \
bundled(rust-crate:pbkdf2) \
bundled(rust-crate:percent-encoding) \
bundled(rust-crate:pin-project) \
bundled(rust-crate:pin-project-internal) \
bundled(rust-crate:pin-project-lite) \
bundled(rust-crate:pin-utils) \
bundled(rust-crate:pkg-config) \
bundled(rust-crate:portable-atomic) \
bundled(rust-crate:ppv-lite86) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:rand) \
bundled(rust-crate:rand_chacha) \
bundled(rust-crate:rand_core) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-automata) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:reqwest) \
bundled(rust-crate:ring) \
bundled(rust-crate:rmp) \
bundled(rust-crate:rmp-serde) \
bundled(rust-crate:rpassword) \
bundled(rust-crate:rtoolbox) \
bundled(rust-crate:runtime-format) \
bundled(rust-crate:rustc-hash) \
bundled(rust-crate:rustix) \
bundled(rust-crate:rustls) \
bundled(rust-crate:rustls-native-certs) \
bundled(rust-crate:rustls-pemfile) \
bundled(rust-crate:rustversion) \
bundled(rust-crate:ryu) \
bundled(rust-crate:same-file) \
bundled(rust-crate:scopeguard) \
bundled(rust-crate:sct) \
bundled(rust-crate:semver) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:serde_path_to_error) \
bundled(rust-crate:serde_regex) \
bundled(rust-crate:serde_urlencoded) \
bundled(rust-crate:sha1) \
bundled(rust-crate:sha2) \
bundled(rust-crate:sharded-slab) \
bundled(rust-crate:shellexpand) \
bundled(rust-crate:signal-hook) \
bundled(rust-crate:signal-hook-mio) \
bundled(rust-crate:signal-hook-registry) \
bundled(rust-crate:signature) \
bundled(rust-crate:slab) \
bundled(rust-crate:smallvec) \
bundled(rust-crate:socket2) \
bundled(rust-crate:sodiumoxide) \
bundled(rust-crate:spin) \
bundled(rust-crate:sql-builder) \
bundled(rust-crate:sqlformat) \
bundled(rust-crate:sqlx) \
bundled(rust-crate:sqlx-core) \
bundled(rust-crate:sqlx-macros) \
bundled(rust-crate:sqlx-rt) \
bundled(rust-crate:stringprep) \
bundled(rust-crate:strsim) \
bundled(rust-crate:subtle) \
bundled(rust-crate:syn) \
bundled(rust-crate:sync_wrapper) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:thread_local) \
bundled(rust-crate:time) \
bundled(rust-crate:tiny-bip39) \
bundled(rust-crate:tinyvec) \
bundled(rust-crate:tinyvec_macros) \
bundled(rust-crate:tokio) \
bundled(rust-crate:tokio-macros) \
bundled(rust-crate:tokio-rustls) \
bundled(rust-crate:tokio-stream) \
bundled(rust-crate:tokio-util) \
bundled(rust-crate:toml) \
bundled(rust-crate:tower) \
bundled(rust-crate:tower-http) \
bundled(rust-crate:tower-layer) \
bundled(rust-crate:tower-service) \
bundled(rust-crate:tracing) \
bundled(rust-crate:tracing-attributes) \
bundled(rust-crate:tracing-core) \
bundled(rust-crate:tracing-subscriber) \
bundled(rust-crate:try-lock) \
bundled(rust-crate:typenum) \
bundled(rust-crate:unicode-bidi) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-normalization) \
bundled(rust-crate:unicode-segmentation) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:unicode_categories) \
bundled(rust-crate:untrusted) \
bundled(rust-crate:url) \
bundled(rust-crate:urlencoding) \
bundled(rust-crate:utf8parse) \
bundled(rust-crate:uuid) \
bundled(rust-crate:vcpkg) \
bundled(rust-crate:version_check) \
bundled(rust-crate:walkdir) \
bundled(rust-crate:want) \
bundled(rust-crate:webpki) \
bundled(rust-crate:webpki-roots) \
bundled(rust-crate:whoami) \
bundled(rust-crate:zeroize) \
bundled(rust-crate:zeroize_derive)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
