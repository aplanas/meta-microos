SUMMARY = "Development files for OpenSSL"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the OpenSSL C API."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "libopenssl-1_0_0-devel-1.0.2u-21.1.aarch64.rpm"
RPM_HASH = "2abc987b0b32502d01fa0f5531c3e4340dbb139495787169815c22e7e6667543cdaef1f2d5248f5bf46e6d87a7c7371c3e82ea2d493cda0d810bcd2161fa378c"

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
