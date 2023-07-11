SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.67.1"

RPM_NAME = "cargo1.67-1.67.1-2.3.aarch64.rpm"
RPM_HASH = "c2b6eb6b0173f7c50c8f94c59d4f14617824624bb397df0c58e312427e40e54281e70e18194a9a48425eda4fa3b551bcc8cf6c01c112a651ead165c51b1ea3f6"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.67 \
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
