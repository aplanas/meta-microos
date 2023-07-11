SUMMARY = "Libraries, includes, etc. used to develop an application with blitz"
DESCRIPTION = "Blitz++ is a C++ template class library that provides high-performance \
multidimensional array containers for scientific computing. \
 \
This package provides the header files and libraries needed to develop a blitz \
application."
LICENSE = "LGPL-3.0-or-later | BSD-3-Clause | Artistic-2.0"

PV = "1.0.2"

RPM_NAME = "blitz-devel-1.0.2-2.12.aarch64.rpm"
RPM_HASH = "b9f2c02ab3ab9347da45b33038ed9fd6f48f0a20e14d94f0a6648498c9f411a6a97096775ca927a95422b70b0036431dc2f5d368d18f8a91c7e4e9089c13d15d"

RPROVIDES:${PN} += "blitz-devel \
pkgconfig-blitz"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblitz0"

inherit rpm
