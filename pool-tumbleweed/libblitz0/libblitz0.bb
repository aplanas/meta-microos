SUMMARY = "Blitz++ Multi-Dimensional Array Library for C++"
DESCRIPTION = "Blitz++ is a C++ template class library that provides high-performance \
multidimensional array containers for scientific computing. \
 \
This package provides shared libraries with blitz."
LICENSE = "LGPL-3.0-or-later | BSD-3-Clause | Artistic-2.0"

PV = "1.0.2"

RPM_NAME = "libblitz0-1.0.2-2.12.aarch64.rpm"
RPM_HASH = "e001844ffbbc97dad288eaca10092fbf39969dfd080f3c30f8b40739231886a81518c3b1076b69a788f7767a3e06017f3bb2cf60532b403b226f9bb0f10c2f15"

RPROVIDES:${PN} += "libblitz.so.0 \
libblitz0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libstdc++.so.6"

inherit rpm
