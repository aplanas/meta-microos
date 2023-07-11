SUMMARY = "MPC multiple-precision complex library"
DESCRIPTION = "MPC is a C library for the arithmetic of complex numbers with \
arbitrarily high precision and correct rounding of the result. It is \
built upon and follows the same principles as MPFR."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw64-libmpc3-1.0.2-3.3.noarch.rpm"
RPM_HASH = "2b4965d438f5fcc7b8b8a0eff86bca2afcab0169bb0ea1b399c75b06386928c1b975d9971275d2553ec602bd0866e7436d5c2557c9638f1e711fd25d7e99432e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libmpc \
mingw64-libmpc-3.dll \
mingw64-libmpc3"

RDEPENDS:${PN} += "mingw64-libgmp-10.dll \
mingw64-libmpfr-4.dll"

inherit rpm
