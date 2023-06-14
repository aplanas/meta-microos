SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.66.0"

RPM_NAME = "cargo1.66-1.66.0-2.4.aarch64.rpm"
RPM_HASH = "326c450879ce233a4563a52ce776d4ef11c30edfe42bc44bd3648dc45a2c53552a70a90c4b9f387ec4085987f4c84c73bd91a7749144dedae96d7f516c0b2c5c"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.66 \
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
