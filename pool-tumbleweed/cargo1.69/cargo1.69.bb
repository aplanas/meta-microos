SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.69.0"

RPM_NAME = "cargo1.69-1.69.0-2.1.aarch64.rpm"
RPM_HASH = "19ac1b01296199442d75a5eca102f3e214afc3aa028614fdb04712b10fc81975bda8cad040b4797265b535a182da1ce9fe5f0ea05a3a7e0bc5f3627e481a4b1b"

RPROVIDES:${PN} += "cargo-vendor \
cargo1.69 \
cargo1.69(aarch-64) \
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
