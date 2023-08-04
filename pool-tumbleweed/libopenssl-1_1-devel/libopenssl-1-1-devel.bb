SUMMARY = "Development files for OpenSSL"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the OpenSSL C API."
LICENSE = "OpenSSL"

PV = "1.1.1v"

RPM_NAME = "libopenssl-1_1-devel-1.1.1v-1.1.aarch64.rpm"
RPM_HASH = "724430cf030bb2fca0487a994da26a42f4971a98cd0c1726e8dbf6cb640084f4442eea1d67edc33606c58802e252a8f92f73896df66d48dfcfa1cd8450ef38c7"

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
