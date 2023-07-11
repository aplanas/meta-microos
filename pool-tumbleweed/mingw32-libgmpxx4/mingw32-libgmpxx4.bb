SUMMARY = "C++ bindings for the GNU MP Library"
DESCRIPTION = "GMP is a free library for arbitrary precision arithmetic, operating on signed integers, \
rational numbers, and floating point numbers.  C++ bindings for the GNU MP Library."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw32-libgmpxx4-6.1.1-3.13.noarch.rpm"
RPM_HASH = "abf0e190e11319114599fa89fce54a20bedb8ad4fa6c481a7d5483aa7091a05dd97b3e28dcfd3f1b51311ce1bf84a2a47b3024d953651075ba6b299758f888ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libgmpxx \
mingw32-libgmpxx-4.dll \
mingw32-libgmpxx4"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll \
mingw32-libgmp-10.dll \
mingw32-libstdc++-6.dll"

inherit rpm
