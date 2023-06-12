SUMMARY = "C++ bindings for the GNU MP Library"
DESCRIPTION = "GMP is a free library for arbitrary precision arithmetic, operating on signed integers, \
rational numbers, and floating point numbers.  C++ bindings for the GNU MP Library."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw32-libgmpxx4-6.1.1-3.11.noarch.rpm"
RPM_HASH = "6c9ba9fe874d3adbcfb697dd4e9af54985d15dcbf4f9d5c36e7f625d5330d63ef8c047692986de3852a25025c122155713ef3926f0fc38ffeea7455b1c506cca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32(libgmpxx-4.dll) \
mingw32-libgmpxx \
mingw32-libgmpxx4"
RDEPENDS:${PN} += "mingw32(libgcc_s_sjlj-1.dll) \
mingw32(libgmp-10.dll) \
mingw32(libstdc++-6.dll)"

inherit rpm
