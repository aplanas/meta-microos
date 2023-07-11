SUMMARY = "The GNU MP Library"
DESCRIPTION = "GMP is a free library for arbitrary precision arithmetic, operating on signed integers, \
rational numbers, and floating point numbers."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw64-libgmp10-6.1.1-3.13.noarch.rpm"
RPM_HASH = "9948c90ad43a940136bfa82330eec33e5b36f331402767566e38ea5c7c397c50d0111a4705c0ef1a3b57042f1f3c4c54f005d2596dbc39c8819386de02c282fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libgmp \
mingw64-libgmp-10.dll \
mingw64-libgmp10"

RDEPENDS:${PN} += ""

inherit rpm
