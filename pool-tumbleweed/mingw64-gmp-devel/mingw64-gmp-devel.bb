SUMMARY = "Include Files and Libraries for Development with the GNU MP Library"
DESCRIPTION = "These libraries are needed to develop programs which calculate with huge numbers (integer and floating point)."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw64-gmp-devel-6.1.1-3.13.noarch.rpm"
RPM_HASH = "2bd6c890843f08105b46af12d2f933d47d4925678de8a28bbd9e5e135228cbcc60986b467dafd6442ebba1b71d9066692f22f8378965534bbf551d6daef4637b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-gmp-devel \
mingw64-lib-gmp \
mingw64-lib-gmpxx"

RDEPENDS:${PN} += "mingw64-libgmp10 \
mingw64-libgmpxx"

inherit rpm
