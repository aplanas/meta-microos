SUMMARY = "Library for handling Apple Binary and XML Property Lists -- Development Files"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists. \
 \
This package contains the development files for C."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.3.0"

RPM_NAME = "libplist-2_0-devel-2.3.0-1.2.aarch64.rpm"
RPM_HASH = "9c1ab5faaafb07c7deced83bdcc7364e591a3dfc3f3c168ff1cc074cdbef3897c7c578b4d2ee6ab514b448a17899115b4ef389bc1377d72de96505972338dc89"

RPROVIDES:${PN} += "libplist-2-0-devel \
libplist-devel \
pkgconfig-libplist-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplist-2-0-4"

inherit rpm
