SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics in XML format"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
in XML format."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2xml-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "aa0b931309beaf5860ff83ca2f4b89cb3adacc44a692e03ab0841f3b615d68e3aeb1acc85ef16d016e82f0d4e9093fd2138d728a3f7909d2e8a29074130cbfc8"

RPROVIDES:${PN} += "pcp-export-pcp2xml"

RDEPENDS:${PN} += "/usr/bin/env \
libpcp3 \
python3-pcp"

inherit rpm
