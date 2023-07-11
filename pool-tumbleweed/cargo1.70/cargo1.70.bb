SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.70.0"

RPM_NAME = "cargo1.70-1.70.0-1.2.aarch64.rpm"
RPM_HASH = "ed5d5a63b64c0b527cbc8b78f56bbbf4ab20f3275915902195977903b3258e93c9d8e8c5630ee3560af954cf96b095773b55c2243716a8cf8ddc5952ef74fd57"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.70 \
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
