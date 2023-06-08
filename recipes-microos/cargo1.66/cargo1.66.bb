SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.66.0"

RPM_NAME = "cargo1.66-1.66.0-2.4.aarch64.rpm"
RPM_HASH = "326c450879ce233a4563a52ce776d4ef11c30edfe42bc44bd3648dc45a2c53552a70a90c4b9f387ec4085987f4c84c73bd91a7749144dedae96d7f516c0b2c5c"

RPROVIDES:${PN} += "cargo-vendor cargo1.66 cargo1.66(aarch-64) rust+cargo"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libz.so.1()(64bit) rust-std"

inherit rpm
