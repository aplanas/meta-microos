SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics in JSON format"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
in JSON format."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2json-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "835bdfcee24ba3143379627b60619392ff39f8f7bd68b61ecbc87efa322ca69f661fd21d94ecf35f1e203a641d3c00e10e53c3720383c1fcbddb41b6d8b6a0cb"

RPROVIDES:${PN} += "pcp-export-pcp2json"

RDEPENDS:${PN} += "/usr/bin/env \
libpcp3 \
python3-pcp"

inherit rpm
