SUMMARY = "Documentation, examples and demos for PDAL"
DESCRIPTION = "This package provides the documentation and sources of examples and data demos of \
PDAL algorithms."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & BSL-1.0"

PV = "2.3.0"

RPM_NAME = "PDAL-doc-2.3.0-2.16.noarch.rpm"
RPM_HASH = "5468866e5f1d9d16104bc98669e99f27b8ff5d0ab5c2471271a08ece5af1a984e94f2bceff6031df856ae03d9377c34b3005bea08002374159645d7fb8d791bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PDAL-doc"

RDEPENDS:${PN} += ""

inherit rpm
