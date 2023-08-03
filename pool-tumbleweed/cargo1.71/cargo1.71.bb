SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.71.0"

RPM_NAME = "cargo1.71-1.71.0-1.1.aarch64.rpm"
RPM_HASH = "df33f3bf1eac54a106fee0a6166035adbc4fe27b4a77d884e8ab9d8d3d915978ccba13d4942e686235bbe21a6b4ac04cfcccbb3632889fa5285976ea869030e4"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.71 \
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
