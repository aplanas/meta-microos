SUMMARY = "Header files for the 3270 Virtual Terminal library"
DESCRIPTION = "Originally designed as part of the pw3270 application, this package provides the development files required to libv3270."
LICENSE = "LGPL-3.0-only"

PV = "5.4"

RPM_NAME = "libv3270-devel-5.4-1.10.aarch64.rpm"
RPM_HASH = "4b3019ba817560909b3d17e150e69f9b1fbdcfbe973829664afc610fbf6d27b0c2673c868809590920bc37dde0999f0be9dfd5888b1ae03e6d104ef8b9c52b90"

RPROVIDES:${PN} += "libv3270-devel \
pkgconfig-libv3270"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libv3270-5-4 \
pkgconfig-gtk+-3.0 \
pkgconfig-lib3270"

inherit rpm
