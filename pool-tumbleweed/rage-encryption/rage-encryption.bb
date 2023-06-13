SUMMARY = "X25519-based, simple, modern, and secure file encryption tool"
DESCRIPTION = "Rage is a simple, modern, and secure file encryption tool, using the \
age format. It features small explicit keys, no config options, and \
UNIX-style composability. \
 \
Keys are based on X25519 which are similar to the ones used by SSH. \
rage-encryption can also use ssh-ed25519 and ssh-rsa keys as \
alternatives to age1 keys."
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & CDDL-1.0 & MIT"

PV = "0.9.1+0"

RPM_NAME = "rage-encryption-0.9.1+0-2.1.aarch64.rpm"
RPM_HASH = "4f41281273c711bc363de73263d367920e9b42cce81bd1151bf829ebcb1faeb9cf68b4dae87e03bf3402fa1079dd7618353721570b3622008edabf07f48b1dc0"

RPROVIDES:${PN} += "bundled(rust-crate:adler) \
bundled(rust-crate:aead) \
bundled(rust-crate:aes) \
bundled(rust-crate:aes-gcm) \
bundled(rust-crate:age) \
bundled(rust-crate:age-core) \
bundled(rust-crate:aho-corasick) \
bundled(rust-crate:arc-swap) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:base64) \
bundled(rust-crate:base64ct) \
bundled(rust-crate:bcrypt-pbkdf) \
bundled(rust-crate:bech32) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:block-buffer) \
bundled(rust-crate:block-padding) \
bundled(rust-crate:blowfish) \
bundled(rust-crate:byteorder) \
bundled(rust-crate:bzip2) \
bundled(rust-crate:bzip2-sys) \
bundled(rust-crate:cbc) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:chacha20) \
bundled(rust-crate:chacha20poly1305) \
bundled(rust-crate:chrono) \
bundled(rust-crate:cipher) \
bundled(rust-crate:console) \
bundled(rust-crate:const-oid) \
bundled(rust-crate:constant_time_eq) \
bundled(rust-crate:cookie-factory) \
bundled(rust-crate:cpufeatures) \
bundled(rust-crate:crc32fast) \
bundled(rust-crate:crypto-common) \
bundled(rust-crate:ctr) \
bundled(rust-crate:ctrlc) \
bundled(rust-crate:curve25519-dalek) \
bundled(rust-crate:dashmap) \
bundled(rust-crate:der) \
bundled(rust-crate:digest) \
bundled(rust-crate:displaydoc) \
bundled(rust-crate:either) \
bundled(rust-crate:env_logger) \
bundled(rust-crate:fastrand) \
bundled(rust-crate:filetime) \
bundled(rust-crate:find-crate) \
bundled(rust-crate:flate2) \
bundled(rust-crate:fluent) \
bundled(rust-crate:fluent-bundle) \
bundled(rust-crate:fluent-langneg) \
bundled(rust-crate:fluent-syntax) \
bundled(rust-crate:fuse_mt) \
bundled(rust-crate:fuser) \
bundled(rust-crate:generic-array) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:ghash) \
bundled(rust-crate:gumdrop) \
bundled(rust-crate:gumdrop_derive) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:hkdf) \
bundled(rust-crate:hmac) \
bundled(rust-crate:humantime) \
bundled(rust-crate:i18n-config) \
bundled(rust-crate:i18n-embed) \
bundled(rust-crate:i18n-embed-fl) \
bundled(rust-crate:i18n-embed-impl) \
bundled(rust-crate:iana-time-zone) \
bundled(rust-crate:inout) \
bundled(rust-crate:intl-memoizer) \
bundled(rust-crate:intl_pluralrules) \
bundled(rust-crate:io-lifetimes) \
bundled(rust-crate:io_tee) \
bundled(rust-crate:itoa) \
bundled(rust-crate:jobserver) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:libm) \
bundled(rust-crate:linux-raw-sys) \
bundled(rust-crate:locale_config) \
bundled(rust-crate:lock_api) \
bundled(rust-crate:log) \
bundled(rust-crate:memchr) \
bundled(rust-crate:minimal-lexical) \
bundled(rust-crate:miniz_oxide) \
bundled(rust-crate:nix) \
bundled(rust-crate:nom) \
bundled(rust-crate:num-bigint-dig) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-iter) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:num_cpus) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:opaque-debug) \
bundled(rust-crate:page_size) \
bundled(rust-crate:parking_lot) \
bundled(rust-crate:parking_lot_core) \
bundled(rust-crate:password-hash) \
bundled(rust-crate:pbkdf2) \
bundled(rust-crate:percent-encoding) \
bundled(rust-crate:pin-project) \
bundled(rust-crate:pin-project-internal) \
bundled(rust-crate:pinentry) \
bundled(rust-crate:pkcs1) \
bundled(rust-crate:pkcs8) \
bundled(rust-crate:pkg-config) \
bundled(rust-crate:poly1305) \
bundled(rust-crate:polyval) \
bundled(rust-crate:ppv-lite86) \
bundled(rust-crate:proc-macro-error) \
bundled(rust-crate:proc-macro-error-attr) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:rage) \
bundled(rust-crate:rand) \
bundled(rust-crate:rand_chacha) \
bundled(rust-crate:rand_core) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:rpassword) \
bundled(rust-crate:rsa) \
bundled(rust-crate:rust-embed) \
bundled(rust-crate:rust-embed-impl) \
bundled(rust-crate:rust-embed-utils) \
bundled(rust-crate:rustc-hash) \
bundled(rust-crate:rustix) \
bundled(rust-crate:ryu) \
bundled(rust-crate:salsa20) \
bundled(rust-crate:same-file) \
bundled(rust-crate:scopeguard) \
bundled(rust-crate:scrypt) \
bundled(rust-crate:secrecy) \
bundled(rust-crate:self_cell) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:sha1) \
bundled(rust-crate:sha2) \
bundled(rust-crate:signature) \
bundled(rust-crate:smallvec) \
bundled(rust-crate:spin) \
bundled(rust-crate:spki) \
bundled(rust-crate:static_assertions) \
bundled(rust-crate:strsim) \
bundled(rust-crate:subtle) \
bundled(rust-crate:syn) \
bundled(rust-crate:tar) \
bundled(rust-crate:tempfile) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:threadpool) \
bundled(rust-crate:time) \
bundled(rust-crate:time-core) \
bundled(rust-crate:tinystr) \
bundled(rust-crate:toml) \
bundled(rust-crate:type-map) \
bundled(rust-crate:typenum) \
bundled(rust-crate:unic-langid) \
bundled(rust-crate:unic-langid-impl) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:universal-hash) \
bundled(rust-crate:users) \
bundled(rust-crate:version_check) \
bundled(rust-crate:walkdir) \
bundled(rust-crate:which) \
bundled(rust-crate:wsl) \
bundled(rust-crate:x25519-dalek) \
bundled(rust-crate:xattr) \
bundled(rust-crate:zerocopy) \
bundled(rust-crate:zerocopy-derive) \
bundled(rust-crate:zeroize) \
bundled(rust-crate:zeroize_derive) \
bundled(rust-crate:zip) \
bundled(rust-crate:zstd) \
bundled(rust-crate:zstd-safe) \
bundled(rust-crate:zstd-sys) \
rage-encryption \
rage-encryption(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit)"

inherit rpm
