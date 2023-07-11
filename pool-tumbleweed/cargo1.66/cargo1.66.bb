SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.66.0"

RPM_NAME = "cargo1.66-1.66.0-2.6.aarch64.rpm"
RPM_HASH = "1335eb2c62884c5fca5655c9e7d67022f43c5ab0d20bba82bac0d87dfac0dd205f049bb80c5b37116555e7860b782f8ee0acda97c9a66d558035471f4aae6f1d"

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
