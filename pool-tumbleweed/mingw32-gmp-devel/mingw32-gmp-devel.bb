SUMMARY = "Include Files and Libraries for Development with the GNU MP Library"
DESCRIPTION = "These libraries are needed to develop programs which calculate with huge numbers (integer and floating point)."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw32-gmp-devel-6.1.1-3.13.noarch.rpm"
RPM_HASH = "e32a68a4623ebe45dcfa24eab5485513a2180623a57fb2fa3dd89c99ab8cdb88ebf3d028a7a07a83db5d42d24c53e42dd8e43cc658171848fde0da2f8b340549"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-gmp-devel \
mingw32-lib-gmp \
mingw32-lib-gmpxx"

RDEPENDS:${PN} += "mingw32-libgmp10 \
mingw32-libgmpxx4"

inherit rpm
