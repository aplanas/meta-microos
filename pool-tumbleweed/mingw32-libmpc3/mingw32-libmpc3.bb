SUMMARY = "MPC multiple-precision complex library"
DESCRIPTION = "MPC is a C library for the arithmetic of complex numbers with \
arbitrarily high precision and correct rounding of the result. It is \
built upon and follows the same principles as MPFR."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw32-libmpc3-1.0.2-3.3.noarch.rpm"
RPM_HASH = "b679ad290cfec813ab817799c981e2a96c95ce5ad9e40dd92a6dc9bdac48cc59a77978a31d631736aa9b6bffd5dbfb3529c45e80e40b3821e605a3121cb23452"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libmpc \
mingw32-libmpc-3.dll \
mingw32-libmpc3"

RDEPENDS:${PN} += "mingw32-libgmp-10.dll \
mingw32-libmpfr-4.dll"

inherit rpm
