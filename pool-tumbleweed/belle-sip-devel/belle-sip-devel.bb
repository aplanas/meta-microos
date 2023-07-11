SUMMARY = "Headers and libraries for the belle-sip library"
DESCRIPTION = "Belle-sip is a SIP (RFC3261) implementation written in C, with an \
object-oriented API. \
 \
This package contains header files and development libraries needed \
to develop applications using the belle-sip library."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.73"

RPM_NAME = "belle-sip-devel-5.2.73-1.1.aarch64.rpm"
RPM_HASH = "e537eeb20a067785175279155ae69c884329c0139172e25c891600dbcc304daadf763a58ab23847e29b803aa5719f3126c8abb3d289145e9e0fcfe7081a74a33"

RPROVIDES:${PN} += "belle-sip-devel \
cmake-BelleSIP \
pkgconfig-belle-sip"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libbctoolbox-tester.so.1 \
libbctoolbox.so.1 \
libbellesip.so.1 \
libbellesip1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
pkgconfig-bctoolbox \
pkgconfig-zlib"

inherit rpm
