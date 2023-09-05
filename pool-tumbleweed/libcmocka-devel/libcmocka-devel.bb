SUMMARY = "Development headers for the cmocka library"
DESCRIPTION = "Development headers for the cmocka unit testing library."
LICENSE = "Apache-2.0"

PV = "1.1.7"

RPM_NAME = "libcmocka-devel-1.1.7-3.1.aarch64.rpm"
RPM_HASH = "4d79b8e4e542c9d67a02cf5137d3a058bd00d7ec467bc79fb2bc69352636d750b17445955e325e441284d70f070413b596f02224ddd9e3862d2d4bb1dd333668"

RPROVIDES:${PN} += "libcmocka-devel \
pkgconfig-cmocka"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcmocka0 \
pkg-config"

inherit rpm
