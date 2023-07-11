SUMMARY = "Library for handling Apple Binary and XML Property Lists -- Development Files"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists. \
 \
This package contains the development files for C++."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.3.0"

RPM_NAME = "libplist++-2_0-devel-2.3.0-1.2.aarch64.rpm"
RPM_HASH = "4efe42d27bf3077fba8fad7c7bd20784cfc43bb9b3961a2563847a0a42c81b3f7acd0bd0b028df67ad963bf961d0a1425095c45ae5ee10c4bec2c7f37b314533"

RPROVIDES:${PN} += "libplist++-2-0-devel \
libplist++-devel \
pkgconfig-libplist++-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplist++-2-0-4 \
pkgconfig-libplist-2.0"

inherit rpm
