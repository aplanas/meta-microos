SUMMARY = "MPC multiple-precision complex library"
DESCRIPTION = "MPC is a C library for the arithmetic of complex numbers with \
arbitrarily high precision and correct rounding of the result. It is \
built upon and follows the same principles as MPFR."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw32-libmpc3-1.0.2-3.1.noarch.rpm"
RPM_HASH = "3a58738ca2fdda7a9d7310ea8207206c10a1a4c640a893cabfd46d8850766a1a10fe2a7b24b012812c4cfd93f3acb71a499179e8a41e4795ef24ac5f50382511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32(libmpc-3.dll) \
mingw32-libmpc \
mingw32-libmpc3"

RDEPENDS:${PN} += "mingw32(libgmp-10.dll) \
mingw32(libmpfr-4.dll)"

inherit rpm
