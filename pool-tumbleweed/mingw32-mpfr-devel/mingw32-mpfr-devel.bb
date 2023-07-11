SUMMARY = "MPFR multiple-precision floating-point library development files"
DESCRIPTION = "MPFR multiple-precision floating-point library development files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.2"

RPM_NAME = "mingw32-mpfr-devel-3.1.2-2.14.noarch.rpm"
RPM_HASH = "776473546d7a64841dfe6fafe682265859573ca888f4feb20ea506df759a01e9eefa5e51c29a49a72171bd156e0c1ec462e35d1bbac9e0e64ba8038c58f6e761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-lib-mpfr \
mingw32-mpfr-devel"

RDEPENDS:${PN} += "mingw32-lib-gmp"

inherit rpm
