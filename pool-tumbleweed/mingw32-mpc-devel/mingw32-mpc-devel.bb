SUMMARY = "MPC multiple-precision complex library development files"
DESCRIPTION = "MPC is a C library for the arithmetic of complex numbers with arbitrarily high precision and correct rounding of the \
result.  This package contains the library development files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw32-mpc-devel-1.0.2-3.3.noarch.rpm"
RPM_HASH = "17086f24fdce6767b69442a5a5985843d7a81630856e2a6cf68cab34951dfa8f2aeaa0bc0f570d13b98a49a9e021f2126625f091c91a2e94ba0ce88280bab6e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-lib-mpc \
mingw32-mpc-devel"

RDEPENDS:${PN} += "mingw32-lib-mpfr"

inherit rpm
