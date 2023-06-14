SUMMARY = "Blitz++ Multi-Dimensional Array Library for C++"
DESCRIPTION = "Blitz++ is a C++ template class library that provides high-performance \
multidimensional array containers for scientific computing. \
 \
This package provides shared libraries with blitz."
LICENSE = "LGPL-3.0-or-later | BSD-3-Clause | Artistic-2.0"

PV = "1.0.2"

RPM_NAME = "libblitz0-1.0.2-2.11.aarch64.rpm"
RPM_HASH = "5b01488ed680bb12781b98f9e5008034e3396a53b5060afbe4da32cef1569d2cd27269124a4ac8740e7637db5815b43f98a3fdcac4a6cebdbb775e0f2d5eb816"

RPROVIDES:${PN} += "libblitz.so.0 \
libblitz0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libstdc++.so.6"

inherit rpm
