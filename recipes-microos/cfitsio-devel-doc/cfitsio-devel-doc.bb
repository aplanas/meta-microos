SUMMARY = "Documentation for the cfitsio library"
DESCRIPTION = "This package contains documentation for the cfitsio library."
LICENSE = "ISC"

PV = "4.2.0"

RPM_NAME = "cfitsio-devel-doc-4.2.0-2.3.aarch64.rpm"
RPM_HASH = "9d272f89b166a55012e46e4dd36aabbff479572ac1940d3fb6dda334ddb92395fac3af81d19d8b6c02a287db74b6947805915ff96fe99d6d2d6adcb939a33db9"

RPROVIDES:${PN} += "cfitsio-devel-doc cfitsio-devel-doc(aarch-64) libcfitsio-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
