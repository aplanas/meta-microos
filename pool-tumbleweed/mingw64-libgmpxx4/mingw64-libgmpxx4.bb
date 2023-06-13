SUMMARY = "C++ bindings for the GNU MP Library"
DESCRIPTION = "GMP is a free library for arbitrary precision arithmetic, operating on signed integers, \
rational numbers, and floating point numbers.  C++ bindings for the GNU MP Library."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw64-libgmpxx4-6.1.1-3.11.noarch.rpm"
RPM_HASH = "b5aada7053600eed5cbdfb67ce5a193dcc0128bfc988ad3e561f98ecf89cdced51e0525752febf705b6debe0712396276f4fecea19b5a49ad28cba1a7cdcfa52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64(libgmpxx-4.dll) \
mingw64-libgmpxx \
mingw64-libgmpxx4"

RDEPENDS:${PN} += "mingw64(libgcc_s_seh-1.dll) \
mingw64(libgmp-10.dll) \
mingw64(libstdc++-6.dll)"

inherit rpm
