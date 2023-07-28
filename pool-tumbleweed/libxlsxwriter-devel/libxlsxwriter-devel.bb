SUMMARY = "Headers for libxlsxwriter"
DESCRIPTION = "Libxlsxwriter is a C library for creating Excel XLSX files. \
 \
This package holds the development files."
LICENSE = "BSD-2-Clause"

PV = "1.1.5"

RPM_NAME = "libxlsxwriter-devel-1.1.5-1.1.aarch64.rpm"
RPM_HASH = "1d4a01282fe9de52ab1df76aaae3a6711e57254389a1b88e166f05e0c975e7f71cdcb0ebca3528bd292621ad43e3e0321c378b96cee9c8a929384dece4a9fa9f"

RPROVIDES:${PN} += "libxlsxwriter-devel \
pkgconfig-xlsxwriter"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxlsxwriter5"

inherit rpm
