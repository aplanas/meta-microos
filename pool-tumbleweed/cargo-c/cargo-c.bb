SUMMARY = "Helper to build and install c-like libraries from Rust"
DESCRIPTION = "The is a cargo applet to build and install C-ABI compatibile dynamic and static \
libraries from Rust. \
 \
It produces and installs a correct pkg-config file, a static library and a \
dynamic library, and a C header to be used by any C (and C-compatible) \
software."
LICENSE = "MIT"

PV = "0.9.15~git0.2d3044b"

RPM_NAME = "cargo-c-0.9.15~git0.2d3044b-2.3.aarch64.rpm"
RPM_HASH = "04dd635a89b70009887c825670cfdc0ea94709833db71721067176b739e0e0a4bbe809eac3e9e08a5ee05d47fc7b264209c5fd48180b9a155d76cf0ee7a36099"

RPROVIDES:${PN} += "cargo-c \
cargo-c(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
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
libz.so.1()(64bit)"

inherit rpm
