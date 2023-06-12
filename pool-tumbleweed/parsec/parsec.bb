SUMMARY = "Platform AbstRaction for SECurity"
DESCRIPTION = "PARSEC is the Platform AbstRaction for SECurity, an open-source initiative to provide \
a common API to hardware security and cryptographic services in a platform-agnostic way. \
This abstraction layer keeps workloads decoupled from physical platform details, \
enabling cloud-native delivery flows within the data center and at the edge."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "parsec-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "157c71ee255b4f384ef229af49e271332301023c8f9eb9d2e43af19dcaa14f0594402392627f32869ca5742e4e8116f443bcfb42f00b6b40b60647502ac238a7"

RPROVIDES:${PN} += "bundled(rust-crate:ahash) \
bundled(rust-crate:aho-corasick) \
bundled(rust-crate:ansi_term) \
bundled(rust-crate:anyhow) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:base64) \
bundled(rust-crate:bincode) \
bundled(rust-crate:bindgen) \
bundled(rust-crate:bitfield) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:bytes) \
bundled(rust-crate:cc) \
bundled(rust-crate:cexpr) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:clang-sys) \
bundled(rust-crate:clap) \
bundled(rust-crate:cmake) \
bundled(rust-crate:cryptoki) \
bundled(rust-crate:cryptoki-sys) \
bundled(rust-crate:derivative) \
bundled(rust-crate:either) \
bundled(rust-crate:enumflags2) \
bundled(rust-crate:enumflags2_derive) \
bundled(rust-crate:env_logger) \
bundled(rust-crate:fallible-iterator) \
bundled(rust-crate:fallible-streaming-iterator) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:glob) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:hashlink) \
bundled(rust-crate:heck) \
bundled(rust-crate:hex) \
bundled(rust-crate:hostname-validator) \
bundled(rust-crate:humantime) \
bundled(rust-crate:itertools) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:lazycell) \
bundled(rust-crate:libc) \
bundled(rust-crate:libloading) \
bundled(rust-crate:libsqlite3-sys) \
bundled(rust-crate:log) \
bundled(rust-crate:mbox) \
bundled(rust-crate:memchr) \
bundled(rust-crate:minimal-lexical) \
bundled(rust-crate:nom) \
bundled(rust-crate:num) \
bundled(rust-crate:num-bigint) \
bundled(rust-crate:num-complex) \
bundled(rust-crate:num-derive) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-iter) \
bundled(rust-crate:num-rational) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:num_cpus) \
bundled(rust-crate:oid) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:parsec-interface) \
bundled(rust-crate:parsec-service) \
bundled(rust-crate:peeking_take_while) \
bundled(rust-crate:pest) \
bundled(rust-crate:picky-asn1) \
bundled(rust-crate:picky-asn1-der) \
bundled(rust-crate:picky-asn1-x509) \
bundled(rust-crate:pkg-config) \
bundled(rust-crate:ppv-lite86) \
bundled(rust-crate:proc-macro-error) \
bundled(rust-crate:proc-macro-error-attr) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:prost) \
bundled(rust-crate:prost-derive) \
bundled(rust-crate:psa-crypto) \
bundled(rust-crate:psa-crypto-sys) \
bundled(rust-crate:quote) \
bundled(rust-crate:rand) \
bundled(rust-crate:rand_chacha) \
bundled(rust-crate:rand_core) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:rusqlite) \
bundled(rust-crate:rustc-hash) \
bundled(rust-crate:rustc_version) \
bundled(rust-crate:same-file) \
bundled(rust-crate:sd-notify) \
bundled(rust-crate:secrecy) \
bundled(rust-crate:semver) \
bundled(rust-crate:semver-parser) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_bytes) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:shlex) \
bundled(rust-crate:signal-hook) \
bundled(rust-crate:signal-hook-registry) \
bundled(rust-crate:smallvec) \
bundled(rust-crate:stable_deref_trait) \
bundled(rust-crate:strsim) \
bundled(rust-crate:structopt) \
bundled(rust-crate:structopt-derive) \
bundled(rust-crate:syn) \
bundled(rust-crate:target-lexicon) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:threadpool) \
bundled(rust-crate:toml) \
bundled(rust-crate:tss-esapi) \
bundled(rust-crate:tss-esapi-sys) \
bundled(rust-crate:ucd-trie) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-segmentation) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:users) \
bundled(rust-crate:uuid) \
bundled(rust-crate:vcpkg) \
bundled(rust-crate:vec_map) \
bundled(rust-crate:version_check) \
bundled(rust-crate:walkdir) \
bundled(rust-crate:which) \
bundled(rust-crate:zeroize) \
bundled(rust-crate:zeroize_derive) \
config(parsec) \
group(parsec) \
group(parsec-clients) \
group(tss) \
parsec \
parsec(aarch-64) \
user(parsec)"
RDEPENDS:${PN} += "/bin/sh \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libtss2-esys.so.0()(64bit) \
libtss2-mu.so.0()(64bit) \
libtss2-tcti-device0 \
libtss2-tctildr.so.0()(64bit) \
system-user-tss \
sysuser-shadow \
tpm2-0-tss"

inherit rpm
