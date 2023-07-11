SUMMARY = "Documentation for the cfitsio library"
DESCRIPTION = "This package contains documentation for the cfitsio library."
LICENSE = "ISC"

PV = "4.2.0"

RPM_NAME = "cfitsio-devel-doc-4.2.0-2.4.aarch64.rpm"
RPM_HASH = "3fd464bc6d3a4634270d63a0817f3f31180438a9967dccecdc8ffe033a2b5a7dc189abca8745fcfee2d9e286f4efb7b32d8dcc096d69acd7b6cda79bc2368d2d"

RPROVIDES:${PN} += "cfitsio-devel-doc \
libcfitsio-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
