SUMMARY = "Data Plane Development Kit API documentation"
DESCRIPTION = "API programming documentation for the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-doc-22.11.1-2.15.noarch.rpm"
RPM_HASH = "1bf5261e326c1551b6d16153af3d8f49b36139d6a5881e924939d7d2b02978af2d3a19f2101f8a89138f54fc455459dc3e31464ede73382952f12a7097214a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-any-doc \
dpdk-doc"

RDEPENDS:${PN} += ""

inherit rpm
