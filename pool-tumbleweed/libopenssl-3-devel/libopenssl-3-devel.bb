SUMMARY = "Development files for OpenSSL"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the OpenSSL C API."
LICENSE = "Apache-2.0"

PV = "3.1.2"

RPM_NAME = "libopenssl-3-devel-3.1.2-1.1.aarch64.rpm"
RPM_HASH = "6c2be000e568af60c196497007d0f319c322324f906438a92f4e1268c8b3bf2a8c70cb8839df856f593c803237b01d5aa70c7b013b843cfbd817c35dc8f214bf"

RPROVIDES:${PN} += "libopenssl-3-devel \
pkgconfig-libcrypto \
pkgconfig-libssl \
pkgconfig-openssl \
ssl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenssl3 \
pkgconfig-libcrypto \
pkgconfig-libssl \
pkgconfig-zlib"

inherit rpm
