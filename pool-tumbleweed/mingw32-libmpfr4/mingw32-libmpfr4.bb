SUMMARY = "MPFR multiple-precision floating-point computation shared library"
DESCRIPTION = "The MPFR library is a C library for multiple-precision floating-point \
computations with exact rounding (also called correct rounding). It is \
based on the GMP multiple-precision library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.2"

RPM_NAME = "mingw32-libmpfr4-3.1.2-2.14.noarch.rpm"
RPM_HASH = "a8e645fa8cc52d5626c3981178164291972eb47e8962ca0982bc6cff6f9b825959a4db2ac260492ced97f0071e7fb69ea2aadee72fb8a74cd917ecdacf1754e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libmpfr \
mingw32-libmpfr-4.dll \
mingw32-libmpfr4"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll \
mingw32-libgmp-10.dll"

inherit rpm
