SUMMARY = "Development files for libdbi (Database Independent Abstraction Layer for C)"
DESCRIPTION = "The libdbi-devel package contains the header files needed to develop \
applications with libdbi."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0.g33"

RPM_NAME = "libdbi-devel-0.9.0.g33-4.10.aarch64.rpm"
RPM_HASH = "6fc074656d85742ac393b716394ad2d6c08bfcbb07d4c2f137f90cd728341b080838bb8e3148b7b21d1ab662e9c1e2f0f3da28404acf167ffd9509640a790e84"

RPROVIDES:${PN} += "libdbi-devel \
pkgconfig-dbi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbi3"

inherit rpm
