SUMMARY = "Libraries, includes, etc. used to develop an application with blitz"
DESCRIPTION = "Blitz++ is a C++ template class library that provides high-performance \
multidimensional array containers for scientific computing. \
 \
This package provides the header files and libraries needed to develop a blitz \
application."
LICENSE = "LGPL-3.0-or-later | BSD-3-Clause | Artistic-2.0"

PV = "1.0.2"

RPM_NAME = "blitz-devel-1.0.2-2.11.aarch64.rpm"
RPM_HASH = "41940fc3f68fbc3b03113464d987938c7671eba2893b2b3cd41ca8bb4f43db1cd1bf316f2c1027c799749996f4e928a8fc09e37d8a85ffaf062f0b7bee5e6174"

RPROVIDES:${PN} += "blitz-devel \
pkgconfig-blitz"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblitz0"

inherit rpm
