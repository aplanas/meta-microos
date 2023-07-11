SUMMARY = "Development files for OpenSSL"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the OpenSSL C API."
LICENSE = "OpenSSL"

PV = "1.1.1u"

RPM_NAME = "libopenssl-1_1-devel-1.1.1u-4.1.aarch64.rpm"
RPM_HASH = "89d533036d0cc8e226fe545ca352d464fc24b28d54db3043a19a8827e4782251476625eb48dfd9f5a0ec1e3278c28c2b7b3193ec25e371b8fe1bf87de4c14b91"

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
