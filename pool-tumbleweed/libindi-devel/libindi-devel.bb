SUMMARY = "Development files for libindi"
DESCRIPTION = "This package contains development files for libindi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.0.3"

RPM_NAME = "libindi-devel-2.0.3-1.1.aarch64.rpm"
RPM_HASH = "82ff740f68985fd9c7937d3fa5853c54fb7e4520b28b6452c1fdffd799e17647c086960a5b8aeca0471e32a4fbc3ba7609df9312898bb59c0667de09d4830516"

RPROVIDES:${PN} += "libindi-devel \
pkgconfig-libindi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libindiAlignmentDriver2 \
libindiclient2 \
libindiclientqt2 \
libindidriver2 \
libindilx200-2"

inherit rpm
