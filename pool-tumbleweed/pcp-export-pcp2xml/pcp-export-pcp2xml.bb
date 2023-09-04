SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics in XML format"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
in XML format."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2xml-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "bf44cf2c0fe8a9ff24a425160374c6f6a9b1e2429f7d312c56e5e6f590011ebe2386750bfc4dadb708e3e68c7817d27b29dc96d25dc88f889c1bee6d40891c06"

RPROVIDES:${PN} += "pcp-export-pcp2xml"

RDEPENDS:${PN} += "/usr/bin/env \
libpcp3 \
python3-pcp"

inherit rpm
