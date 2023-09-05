SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.72.0"

RPM_NAME = "cargo1.72-1.72.0-1.1.aarch64.rpm"
RPM_HASH = "5887e8664e4beb32e2bd87b9c704a813d204bf2312e0dd22eeddc6dda2530452c7b39a8c40e82d9a8f42f2bfca12306b4ebacb2b81637ee953425111c6615532"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.72 \
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
