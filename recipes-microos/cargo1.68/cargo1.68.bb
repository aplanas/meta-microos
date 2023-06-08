SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it."
LICENSE = "Apache-2.0 | MIT"

PV = "1.68.2"

RPM_NAME = "cargo1.68-1.68.2-2.1.aarch64.rpm"
RPM_HASH = "727e7ba7b43e5b8c712cd68ab9b9063cda70d63704d795801d9bb979ba78d32293b734dbd8af93c95e8aee97d8d8a16ca7244d35ce155edb61b951a45d92e53d"

RPROVIDES:${PN} += "cargo-vendor cargo1.68 cargo1.68(aarch-64) rust+cargo"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libz.so.1()(64bit) rust-std"

inherit rpm
