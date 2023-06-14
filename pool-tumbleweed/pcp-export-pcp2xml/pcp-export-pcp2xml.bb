SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics in XML format"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
in XML format."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2xml-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "f4e3976c3ee4df225800ceed4f5fa58a565f730e6d3e53d65d450f53d248508c62abcc840861e381eb0845142cd778e450f587547e8d75bb781732896b651ee2"

RPROVIDES:${PN} += "pcp-export-pcp2xml"

RDEPENDS:${PN} += "/usr/bin/env \
libpcp3 \
python3-pcp"

inherit rpm
