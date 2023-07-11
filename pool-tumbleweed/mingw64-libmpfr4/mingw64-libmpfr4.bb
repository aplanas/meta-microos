SUMMARY = "MPFR multiple-precision floating-point computation shared library"
DESCRIPTION = "The MPFR library is a C library for multiple-precision floating-point \
computations with exact rounding (also called correct rounding). It is \
based on the GMP multiple-precision library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "mingw64-libmpfr4-3.1.4-2.14.noarch.rpm"
RPM_HASH = "216aebbde7efc13bc57b808a81a95a5cccf908eb502061f7c6e8b9368929d1093104a0829bdea7628b88907365755e3aafb68e125ebebc7d6fdba3a5a344f7bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libmpfr \
mingw64-libmpfr-4.dll \
mingw64-libmpfr4"

RDEPENDS:${PN} += "mingw64-libgcc-s-seh-1.dll \
mingw64-libgmp-10.dll"

inherit rpm
