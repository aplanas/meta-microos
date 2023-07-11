SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to Zabbix"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
to the Zabbix (https://www.zabbix.org/) monitoring software."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2zabbix-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "5f4ddae04d93ba3675de665904bffaa4f2bdfed3760077dd33458e754179407ab66d205ef792f7fd0c76befc3e17d32b5dc709ced5be7ca56beb3feb758fcdfa"

RPROVIDES:${PN} += "pcp-export-pcp2zabbix"

RDEPENDS:${PN} += "/usr/bin/env \
python3-pcp"

inherit rpm
