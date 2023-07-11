SUMMARY = "MPFR multiple-precision floating-point library development files"
DESCRIPTION = "MPFR multiple-precision floating-point library development files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "mingw64-mpfr-devel-3.1.4-2.14.noarch.rpm"
RPM_HASH = "bebd816bfda145f6b4c35a70ab755a8b601854c3f81bc73eb0a564e3295e4ab4e7aea3ad86ff76f7dd872e92d1e8f61305b3b31b2dbcb069de817bd13af6dd50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-lib-mpfr \
mingw64-mpfr-devel"

RDEPENDS:${PN} += "mingw64-lib-gmp"

inherit rpm
