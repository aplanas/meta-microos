SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to Graphite"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
to graphite (http://graphite.readthedocs.org)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2graphite-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "851fd517d495b3d446ce6fbdd9ec1a27ecb12740e4c4e25114d4d0b0ca7ce3868119140ca382dfe7a92a122955a661810787ea8c084a78f518a85c326d010380"

RPROVIDES:${PN} += "pcp-export-pcp2graphite"

RDEPENDS:${PN} += "/usr/bin/env \
python3-pcp"

inherit rpm
