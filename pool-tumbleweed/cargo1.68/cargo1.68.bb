SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.68.2"

RPM_NAME = "cargo1.68-1.68.2-2.1.aarch64.rpm"
RPM_HASH = "727e7ba7b43e5b8c712cd68ab9b9063cda70d63704d795801d9bb979ba78d32293b734dbd8af93c95e8aee97d8d8a16ca7244d35ce155edb61b951a45d92e53d"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.68 \
rust+cargo"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libz.so.1 \
rust-std"

inherit rpm
