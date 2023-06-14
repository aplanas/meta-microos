SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi2-devel-static-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "c728791e06294dffeb2b4e5de3fedcc97abb3ad946fb8401debf2f6e3ff1b309d974abd205994de3fbc8b882ddf4f5e89f3360652d99aa91e2685000076e2678"

RPROVIDES:${PN} += "ptscotch-openmpi2-devel-static \
scotch-devel-static"

RDEPENDS:${PN} += "ptscotch-openmpi2-devel"

inherit rpm
