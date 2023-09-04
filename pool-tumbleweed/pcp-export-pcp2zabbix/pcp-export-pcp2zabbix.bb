SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to Zabbix"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
to the Zabbix (https://www.zabbix.org/) monitoring software."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2zabbix-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "65ade2fa7dd93c9c2bedd824a9af2b512737d4f919cb5a894ff3c9f6dc0e98c31e58c288cdec46c50cc00107b8279486e2290045a650315758081609bf3440cd"

RPROVIDES:${PN} += "pcp-export-pcp2zabbix"

RDEPENDS:${PN} += "/usr/bin/env \
python3-pcp"

inherit rpm
