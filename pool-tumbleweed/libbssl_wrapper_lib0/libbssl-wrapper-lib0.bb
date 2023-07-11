SUMMARY = "Library which translates BoringSSL calls to OpenSSL calls"
DESCRIPTION = "bssl_wrapper is a library which translates BoringSSL calls to OpenSSL calls."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "libbssl_wrapper_lib0-2.0.1-1.10.aarch64.rpm"
RPM_HASH = "f1b6aa94d47d0954da978760ff03111c3083dde159e50df1a9cfb4bebcc78b88cb2b8ba151aa7a6b33ece2738332fee0f3437c105d279d2c8d14b3accc4b0706"

RPROVIDES:${PN} += "libbssl-wrapper-lib.so.0 \
libbssl-wrapper-lib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
