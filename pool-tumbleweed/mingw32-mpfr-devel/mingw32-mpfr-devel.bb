SUMMARY = "MPFR multiple-precision floating-point library development files"
DESCRIPTION = "MPFR multiple-precision floating-point library development files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.2"

RPM_NAME = "mingw32-mpfr-devel-3.1.2-2.12.noarch.rpm"
RPM_HASH = "ae0ba6324a5794e40539333b048d61bb14cef9ddc7dde5fa5c492d59f86e44181526d2c5153472d71d39bb1a36d413372ab4ed3778dac5e346ab511f4f509f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-lib-mpfr \
mingw32-mpfr-devel"

RDEPENDS:${PN} += "mingw32-lib-gmp"

inherit rpm
