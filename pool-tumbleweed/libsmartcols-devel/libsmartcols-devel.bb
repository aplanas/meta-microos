SUMMARY = "Development files for libsmartcols"
DESCRIPTION = "Files to develop applications using the libsmartcols library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libsmartcols-devel-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "85b33c455daa3d37916ba1a5c8acebadbe9be8eb756e932788f99d7e141c57e6b67278429dc023a6e3553edd95d10cb3365114146436ef74aab4f5b6d5f5ae2d"

RPROVIDES:${PN} += "libsmartcols-devel \
pkgconfig-smartcols"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsmartcols1"

inherit rpm
