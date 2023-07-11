SUMMARY = "Development files for OpenSSL"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the OpenSSL C API."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "libopenssl-1_0_0-devel-1.0.2u-20.1.aarch64.rpm"
RPM_HASH = "2c21a26d6cddba6bc32244adeb3c3e7645a55e380ed6726d3cc28502d3cb9676c9c7920d8a296e59c8871a86f50d56cbf2e5cd1c98fc52d381ba754463dbe08a"

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
