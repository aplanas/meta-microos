SUMMARY = "MPC multiple-precision complex library development files"
DESCRIPTION = "MPC is a C library for the arithmetic of complex numbers with arbitrarily high precision and correct rounding of the \
result.  This package contains the library development files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw32-mpc-devel-1.0.2-3.1.noarch.rpm"
RPM_HASH = "5a71e0ffbc4456883495d5de0107b059dd82c5e6697dddc42fa9511ffb1842c9fdb3e4132b943b4fcccba6d266b4683c1315025c02f131b2e990d62caf8e4002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32(lib:mpc) \
mingw32-mpc-devel"
RDEPENDS:${PN} += "mingw32(lib:mpfr)"

inherit rpm
