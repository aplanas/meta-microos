SUMMARY = "A tool for managing user Rust toolchains"
DESCRIPTION = "A tool to manager user Rust toolchains. This is generally used by developers \
managing multiple parallel toolchains in their environment."
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & ISC & MIT"

PV = "1.25.2~0"

RPM_NAME = "rustup-1.25.2~0-4.1.aarch64.rpm"
RPM_HASH = "a8542fdd98da88c203bd517ffab56363ff20b65d632beaf17252ccc98046ee143cbb3405064adca2e8357139d906e465ad095d7ef6ab634879bd2020098119a4"

RPROVIDES:${PN} += "bundled(rust-crate:adler) \
bundled(rust-crate:aead) \
bundled(rust-crate:aes) \
bundled(rust-crate:aes-soft) \
bundled(rust-crate:aho-corasick) \
bundled(rust-crate:ansi_term) \
bundled(rust-crate:anyhow) \
bundled(rust-crate:ascii-canvas) \
bundled(rust-crate:async-compression) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:base64) \
bundled(rust-crate:bit-set) \
bundled(rust-crate:bit-vec) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:bitvec) \
bundled(rust-crate:block-buffer) \
bundled(rust-crate:block-modes) \
bundled(rust-crate:block-padding) \
bundled(rust-crate:blowfish) \
bundled(rust-crate:bstr) \
bundled(rust-crate:buffered-reader) \
bundled(rust-crate:byteorder) \
bundled(rust-crate:bytes) \
bundled(rust-crate:cast5) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:chrono) \
bundled(rust-crate:cipher) \
bundled(rust-crate:clap) \
bundled(rust-crate:cmac) \
bundled(rust-crate:const-oid) \
bundled(rust-crate:cpufeatures) \
bundled(rust-crate:crc32fast) \
bundled(rust-crate:crunchy) \
bundled(rust-crate:crypto-common) \
bundled(rust-crate:crypto-mac) \
bundled(rust-crate:ctr) \
bundled(rust-crate:curl) \
bundled(rust-crate:curl-sys) \
bundled(rust-crate:curve25519-dalek) \
bundled(rust-crate:dbl) \
bundled(rust-crate:der) \
bundled(rust-crate:des) \
bundled(rust-crate:diff) \
bundled(rust-crate:digest) \
bundled(rust-crate:dirs-next) \
bundled(rust-crate:dirs-sys-next) \
bundled(rust-crate:download) \
bundled(rust-crate:dyn-clone) \
bundled(rust-crate:eax) \
bundled(rust-crate:ecdsa) \
bundled(rust-crate:ed25519) \
bundled(rust-crate:ed25519-dalek) \
bundled(rust-crate:effective-limits) \
bundled(rust-crate:either) \
bundled(rust-crate:elliptic-curve) \
bundled(rust-crate:ena) \
bundled(rust-crate:encoding_rs) \
bundled(rust-crate:enum-map) \
bundled(rust-crate:enum-map-derive) \
bundled(rust-crate:env_proxy) \
bundled(rust-crate:fastrand) \
bundled(rust-crate:ff) \
bundled(rust-crate:filetime) \
bundled(rust-crate:fixedbitset) \
bundled(rust-crate:flate2) \
bundled(rust-crate:fnv) \
bundled(rust-crate:foreign-types) \
bundled(rust-crate:foreign-types-shared) \
bundled(rust-crate:form_urlencoded) \
bundled(rust-crate:funty) \
bundled(rust-crate:futures-channel) \
bundled(rust-crate:futures-core) \
bundled(rust-crate:futures-io) \
bundled(rust-crate:futures-sink) \
bundled(rust-crate:futures-task) \
bundled(rust-crate:futures-util) \
bundled(rust-crate:generic-array) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:git-testament) \
bundled(rust-crate:git-testament-derive) \
bundled(rust-crate:group) \
bundled(rust-crate:h2) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:hmac) \
bundled(rust-crate:home) \
bundled(rust-crate:http) \
bundled(rust-crate:http-body) \
bundled(rust-crate:httparse) \
bundled(rust-crate:httpdate) \
bundled(rust-crate:hyper) \
bundled(rust-crate:hyper-rustls) \
bundled(rust-crate:hyper-tls) \
bundled(rust-crate:iana-time-zone) \
bundled(rust-crate:idea) \
bundled(rust-crate:idna) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:io-lifetimes) \
bundled(rust-crate:ipnet) \
bundled(rust-crate:is-terminal) \
bundled(rust-crate:itertools) \
bundled(rust-crate:itoa) \
bundled(rust-crate:jobserver) \
bundled(rust-crate:lalrpop) \
bundled(rust-crate:lalrpop-util) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:libm) \
bundled(rust-crate:libz-sys) \
bundled(rust-crate:linux-raw-sys) \
bundled(rust-crate:lock_api) \
bundled(rust-crate:log) \
bundled(rust-crate:lzma-sys) \
bundled(rust-crate:md-5) \
bundled(rust-crate:memchr) \
bundled(rust-crate:memsec) \
bundled(rust-crate:mime) \
bundled(rust-crate:miniz_oxide) \
bundled(rust-crate:mio) \
bundled(rust-crate:native-tls) \
bundled(rust-crate:new_debug_unreachable) \
bundled(rust-crate:no-std-compat) \
bundled(rust-crate:num-bigint) \
bundled(rust-crate:num-bigint-dig) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-iter) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:num_cpus) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:opaque-debug) \
bundled(rust-crate:opener) \
bundled(rust-crate:openssl) \
bundled(rust-crate:openssl-macros) \
bundled(rust-crate:openssl-probe) \
bundled(rust-crate:openssl-sys) \
bundled(rust-crate:p256) \
bundled(rust-crate:parking_lot) \
bundled(rust-crate:parking_lot_core) \
bundled(rust-crate:pem) \
bundled(rust-crate:percent-encoding) \
bundled(rust-crate:petgraph) \
bundled(rust-crate:phf_shared) \
bundled(rust-crate:pin-project-lite) \
bundled(rust-crate:pin-utils) \
bundled(rust-crate:pkcs8) \
bundled(rust-crate:pkg-config) \
bundled(rust-crate:ppv-lite86) \
bundled(rust-crate:precomputed-hash) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:pulldown-cmark) \
bundled(rust-crate:quote) \
bundled(rust-crate:radium) \
bundled(rust-crate:rand) \
bundled(rust-crate:rand_chacha) \
bundled(rust-crate:rand_core) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-automata) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:remove_dir_all) \
bundled(rust-crate:reqwest) \
bundled(rust-crate:retry) \
bundled(rust-crate:ring) \
bundled(rust-crate:ripemd160) \
bundled(rust-crate:rs_tracing) \
bundled(rust-crate:rsa) \
bundled(rust-crate:rustix) \
bundled(rust-crate:rustls) \
bundled(rust-crate:rustls-native-certs) \
bundled(rust-crate:rustls-pemfile) \
bundled(rust-crate:rustup) \
bundled(rust-crate:ryu) \
bundled(rust-crate:same-file) \
bundled(rust-crate:scopeguard) \
bundled(rust-crate:sct) \
bundled(rust-crate:semver) \
bundled(rust-crate:sequoia-openpgp) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:serde_urlencoded) \
bundled(rust-crate:sha-1) \
bundled(rust-crate:sha1collisiondetection) \
bundled(rust-crate:sha2) \
bundled(rust-crate:sharded-slab) \
bundled(rust-crate:signature) \
bundled(rust-crate:simple_asn1) \
bundled(rust-crate:siphasher) \
bundled(rust-crate:slab) \
bundled(rust-crate:smallvec) \
bundled(rust-crate:socket2) \
bundled(rust-crate:spin) \
bundled(rust-crate:spki) \
bundled(rust-crate:string_cache) \
bundled(rust-crate:strsim) \
bundled(rust-crate:subtle) \
bundled(rust-crate:syn) \
bundled(rust-crate:sys-info) \
bundled(rust-crate:tap) \
bundled(rust-crate:tar) \
bundled(rust-crate:tempfile) \
bundled(rust-crate:term) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:threadpool) \
bundled(rust-crate:time) \
bundled(rust-crate:time-core) \
bundled(rust-crate:time-macros) \
bundled(rust-crate:tiny-keccak) \
bundled(rust-crate:tinyvec) \
bundled(rust-crate:tinyvec_macros) \
bundled(rust-crate:tokio) \
bundled(rust-crate:tokio-native-tls) \
bundled(rust-crate:tokio-rustls) \
bundled(rust-crate:tokio-socks) \
bundled(rust-crate:tokio-util) \
bundled(rust-crate:toml) \
bundled(rust-crate:tower-service) \
bundled(rust-crate:tracing) \
bundled(rust-crate:tracing-core) \
bundled(rust-crate:try-lock) \
bundled(rust-crate:twofish) \
bundled(rust-crate:typenum) \
bundled(rust-crate:unicase) \
bundled(rust-crate:unicode-bidi) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-normalization) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:unicode-xid) \
bundled(rust-crate:untrusted) \
bundled(rust-crate:url) \
bundled(rust-crate:vec_map) \
bundled(rust-crate:version_check) \
bundled(rust-crate:wait-timeout) \
bundled(rust-crate:want) \
bundled(rust-crate:webpki) \
bundled(rust-crate:wyz) \
bundled(rust-crate:x25519-dalek) \
bundled(rust-crate:xattr) \
bundled(rust-crate:xxhash-rust) \
bundled(rust-crate:xz2) \
bundled(rust-crate:zeroize) \
bundled(rust-crate:zeroize_derive) \
bundled(rust-crate:zstd) \
bundled(rust-crate:zstd-safe) \
bundled(rust-crate:zstd-sys) \
cargo1.53-doc \
cargo1.54-doc \
cargo1.55-doc \
rls1.53 \
rls1.54 \
rls1.55 \
rust-analyzer \
rust1.53-analysis \
rust1.53-doc \
rust1.53-src \
rust1.54-analysis \
rust1.54-doc \
rust1.54-src \
rust1.55-analysis \
rust1.55-doc \
rust1.55-src \
rustup \
rustup(aarch-64)"

RDEPENDS:${PN} += "gcc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
