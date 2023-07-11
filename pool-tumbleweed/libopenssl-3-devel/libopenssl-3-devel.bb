SUMMARY = "Development files for OpenSSL"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the OpenSSL C API."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "libopenssl-3-devel-3.1.1-2.1.aarch64.rpm"
RPM_HASH = "fff33a1760aba9493d71eb799ef403a4ed5dcaefbf6342190817dc1dc8463762ab705ab098c74068dd699274eaf359ec4debca6740aa7d4eecbf2aa586d16bba"

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
