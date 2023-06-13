SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to Zabbix"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
to the Zabbix (https://www.zabbix.org/) monitoring software."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2zabbix-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "455f7f9e1002e5667274f56b9a3482821b4379edaafb7cee5047064ed6b395d7c5837a0253103040e4fdabe4602cc882d9286d908a557f12aae4fb98792a078c"

RPROVIDES:${PN} += "pcp-export-pcp2zabbix \
pcp-export-pcp2zabbix(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env \
python3-pcp"

inherit rpm
