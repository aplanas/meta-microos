SUMMARY = "API documentation of the RTRlib"
DESCRIPTION = "This is the API documentation of the RTRlib, a C implementation of \
the RPKI/Router Protocol client."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "rtrlib-devel-doc-0.8.0-1.8.noarch.rpm"
RPM_HASH = "74b09b61ee3d0b302cf293403b7b9e5ff9f8dc8c6404d95ab29d3b06d6b886047ddbcf922b870319ab22009a1ea0fedb2b840a0f3412e3e3e0eb920989968e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rtrlib-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
