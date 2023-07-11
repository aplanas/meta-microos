SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics in JSON format"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
in JSON format."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2json-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "71814682947b49a6aaaa916c86c2fd30939183d0cf2c422f6e182abf662f7a545a4f304458a7000469b8f7807a40257bd910d996fd6d0c884e601831d65dbead"

RPROVIDES:${PN} += "pcp-export-pcp2json"

RDEPENDS:${PN} += "/usr/bin/env \
libpcp3 \
python3-pcp"

inherit rpm
