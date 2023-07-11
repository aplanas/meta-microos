SUMMARY = "Performance Co-Pilot archive tools for importing iostat data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing iostat data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-import-iostat2pcp-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "b706a38356e694db10db3c484c6bc238040a501e98c08be576ef9e8f6a5e40541b4e0f7cded01d6ad81ce37e5599b2559675ca805fde98e1128df5e6eb79ebb2"

RPROVIDES:${PN} += "pcp-import-iostat2pcp"

RDEPENDS:${PN} += "/usr/bin/env \
perl-PCP-LogImport \
sysstat"

inherit rpm
