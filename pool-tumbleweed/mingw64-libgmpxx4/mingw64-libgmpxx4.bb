SUMMARY = "C++ bindings for the GNU MP Library"
DESCRIPTION = "GMP is a free library for arbitrary precision arithmetic, operating on signed integers, \
rational numbers, and floating point numbers.  C++ bindings for the GNU MP Library."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw64-libgmpxx4-6.1.1-3.13.noarch.rpm"
RPM_HASH = "5c92e87cb41e84ccc6a2963e3a48c2e073811d40bfe88cbbf5d38df39a2e5446d3f27694d7c1482025974c9ec6af7ee15b5a34167d1c42c3fbd312b96afc00c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libgmpxx \
mingw64-libgmpxx-4.dll \
mingw64-libgmpxx4"

RDEPENDS:${PN} += "mingw64-libgcc-s-seh-1.dll \
mingw64-libgmp-10.dll \
mingw64-libstdc++-6.dll"

inherit rpm
