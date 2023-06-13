SUMMARY = "MPFR multiple-precision floating-point computation shared library"
DESCRIPTION = "The MPFR library is a C library for multiple-precision floating-point \
computations with exact rounding (also called correct rounding). It is \
based on the GMP multiple-precision library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "mingw64-libmpfr4-3.1.4-2.12.noarch.rpm"
RPM_HASH = "2095fa3eafbb3cfcaeeda0d4c5802fa06ca1593a99fd8bbd32dccad7889890a6d2cd43fb174a61fb78d36290067ad7a54c974ce13ca432312be1e268320311fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64(libmpfr-4.dll) \
mingw64-libmpfr \
mingw64-libmpfr4"

RDEPENDS:${PN} += "mingw64(libgcc_s_seh-1.dll) \
mingw64(libgmp-10.dll)"

inherit rpm
