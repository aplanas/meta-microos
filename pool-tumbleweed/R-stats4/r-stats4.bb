SUMMARY = "Package providing R-stats4"
DESCRIPTION = "This package provides R-stats4, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-stats4-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "bc21138959e61f5a5db776cca8f05a7a351481a9d1014fada2693579def10ba1ee9ad47ff0ef29d8d30accc9417af1f794e93532791768197e09eccf691b3a33"

RPROVIDES:${PN} += "R-stats4"

RDEPENDS:${PN} += "R-base"

inherit rpm
