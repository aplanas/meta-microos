SUMMARY = "Headers and libraries for the belcard library"
DESCRIPTION = "Belcard is a C++ library to manipulate the vCard standard format files. \
 \
This package contains header files and development libraries needed \
to develop applications using the belcard library."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "belcard-devel-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "c1d157766260ac7ecdb3806ba04af6578206b7bd0ae448dfc14c691fa6aec4642f31504e11d01ee6b3c681c44607e999604372c31ccb9912717de3ac3d551d3e"

RPROVIDES:${PN} += "belcard-devel \
pkgconfig-belcard"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libbctoolbox-tester.so.1 \
libbelcard.so.1 \
libbelcard1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
pkgconfig-bctoolbox \
pkgconfig-belr"

inherit rpm
