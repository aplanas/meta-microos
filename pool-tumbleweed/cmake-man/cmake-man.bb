SUMMARY = "Manual pages for cmake, a cross-platform make system"
DESCRIPTION = "Manual pages for cmake, a cross-platform make system."
LICENSE = "BSD-3-Clause"

PV = "3.26.4"

RPM_NAME = "cmake-man-3.26.4-3.1.aarch64.rpm"
RPM_HASH = "788046303e45e3e8c8c56686abfb1e1e2f7e5d0e93ded75e7d6ae05ff382bee54d47d982560a0809e8608ecfc402496c847058699c2174d68ddf6d3de2f31219"

RPROVIDES:${PN} += "cmake-man"

RDEPENDS:${PN} += ""

inherit rpm
