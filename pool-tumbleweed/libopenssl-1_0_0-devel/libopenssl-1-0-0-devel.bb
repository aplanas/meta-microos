SUMMARY = "Development files for OpenSSL"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the OpenSSL C API."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "libopenssl-1_0_0-devel-1.0.2u-22.1.aarch64.rpm"
RPM_HASH = "c7fd4fef7361c3d2c9add6df254511ba4987d7b5f223aef630629562de078971f8147efbde01301bfef588024ade8706a31d06e9df69d6a988e7951d36c72dbd"

RPROVIDES:${PN} += "libopenssl-1-0-0-devel \
pkgconfig-libcrypto \
pkgconfig-libssl \
pkgconfig-openssl \
ssl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenssl1-0-0 \
pkgconfig-libcrypto \
pkgconfig-libssl \
pkgconfig-zlib"

inherit rpm
