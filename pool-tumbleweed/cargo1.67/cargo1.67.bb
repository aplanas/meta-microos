SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.67.1"

RPM_NAME = "cargo1.67-1.67.1-2.1.aarch64.rpm"
RPM_HASH = "f68bda852ac44ffe31ba1706fb48fdbc28d8d9067ebd9fff8e3950bbe265e433ef06f8fad28352ccab647b90cefe778d8245a43a35c0226435e3ee3718a4bf7f"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.67 \
cargo1.67(aarch-64) \
rust+cargo"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libz.so.1()(64bit) \
rust-std"

inherit rpm
