SUMMARY = "Development files for libwpe"
DESCRIPTION = "The libwpe-devel package contains libraries, build data, and \
header files for developing applications that use libwpe."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "libwpe-devel-1.14.0-1.3.aarch64.rpm"
RPM_HASH = "c5da435beb612b45f8890592f1754ac7eceefe717e18826960d6ccd62d1ab6d57debde7411597f56e25b82eee09a9ead82e30e4c8aba2afc27ef21187d24da09"

RPROVIDES:${PN} += "libwpe-devel \
pkgconfig-wpe-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwpe-1-0-1 \
pkgconfig-egl \
pkgconfig-xkbcommon"

inherit rpm
