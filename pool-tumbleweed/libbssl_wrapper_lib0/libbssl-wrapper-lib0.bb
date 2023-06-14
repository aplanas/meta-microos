SUMMARY = "Library which translates BoringSSL calls to OpenSSL calls"
DESCRIPTION = "bssl_wrapper is a library which translates BoringSSL calls to OpenSSL calls."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "libbssl_wrapper_lib0-2.0.1-1.9.aarch64.rpm"
RPM_HASH = "2d6c49117230b36abd3a19f4156bc6729b706f663c6e674c34acee58d598c140a788a4262e75cda771c69b63dc0499385f96a0dd96e98be8a230068a0c98e8a0"

RPROVIDES:${PN} += "libbssl-wrapper-lib.so.0 \
libbssl-wrapper-lib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
