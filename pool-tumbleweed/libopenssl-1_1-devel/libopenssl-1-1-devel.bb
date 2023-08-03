SUMMARY = "Development files for OpenSSL"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the OpenSSL C API."
LICENSE = "OpenSSL"

PV = "1.1.1u"

RPM_NAME = "libopenssl-1_1-devel-1.1.1u-5.1.aarch64.rpm"
RPM_HASH = "0f27b3d94e6cfbba5e79ad2abffafc712aab06e98a28a80232a2dc43af9116f166b6e136c5a585f74ff20529265ed0b2e914ab873f978015a799a63b4bee6d4b"

RPROVIDES:${PN} += "libopenssl-1-1-devel \
pkgconfig-libcrypto \
pkgconfig-libssl \
pkgconfig-openssl \
ssl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenssl1-1 \
pkgconfig-libcrypto \
pkgconfig-libssl \
pkgconfig-zlib"

inherit rpm
