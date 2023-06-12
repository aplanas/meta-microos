SUMMARY = "MPC multiple-precision complex library development files"
DESCRIPTION = "MPC is a C library for the arithmetic of complex numbers with \
arbitrarily high precision and correct rounding of the result. This \
package contains the library development files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw64-mpc-devel-1.0.2-3.1.noarch.rpm"
RPM_HASH = "6236dfc1bffed78892027c32acb4ce02cf542c09f5ef0afea57a140606b792a909ef9ee816279e97fcfb85576d9a41a0687fcb3ec67b4df212eb6e5d9aa00d5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64(lib:mpc) \
mingw64-mpc-devel"
RDEPENDS:${PN} += "mingw64(lib:mpfr)"

inherit rpm
