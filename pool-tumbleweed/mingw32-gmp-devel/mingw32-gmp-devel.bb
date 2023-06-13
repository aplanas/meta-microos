SUMMARY = "Include Files and Libraries for Development with the GNU MP Library"
DESCRIPTION = "These libraries are needed to develop programs which calculate with huge numbers (integer and floating point)."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw32-gmp-devel-6.1.1-3.11.noarch.rpm"
RPM_HASH = "1066833c3b62b8c2c802a12480802f102ffe900aaf1f02b17353609369623f6eeaf4efdd141058cf71875c9e0e9ba6454b069852d151285f8480f42802099998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32(lib:gmp) \
mingw32(lib:gmpxx) \
mingw32-gmp-devel"

RDEPENDS:${PN} += "mingw32-libgmp10 \
mingw32-libgmpxx4"

inherit rpm
