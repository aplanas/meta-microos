SUMMARY = "Headers and libraries for the belcard library"
DESCRIPTION = "Belcard is a C++ library to manipulate the vCard standard format files. \
 \
This package contains header files and development libraries needed \
to develop applications using the belcard library."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.16"

RPM_NAME = "belcard-devel-5.2.16-1.4.aarch64.rpm"
RPM_HASH = "25df09531f21e891445514b9cef3ec7a2166f19042f86b7927afb82415f31b1d0514436d68893bdad9c23f2089136c2b75ced953c6028ad99470e27a667f9a5f"

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
