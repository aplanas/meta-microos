SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.69.0"

RPM_NAME = "cargo1.69-1.69.0-2.3.aarch64.rpm"
RPM_HASH = "dd7394f0d87f2f23305156fd08a70ee2eb67ded18629c6c3b73b95532e480973d3b979af950917ba0225640969e5d0b56cb24ab23287651941cafd5b2ffdfeae"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.69 \
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
