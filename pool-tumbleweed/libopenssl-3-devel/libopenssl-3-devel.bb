SUMMARY = "Development files for OpenSSL"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the OpenSSL C API."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "libopenssl-3-devel-3.1.1-3.1.aarch64.rpm"
RPM_HASH = "3ce2cc4616114c8701544afb4c0d8202ecd5de69b4a9fb8497903c1a946b621c9e62a4b6fc22539e5224e2b7276078aa4d62138f466246cbc9bd6032a3a64763"

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
