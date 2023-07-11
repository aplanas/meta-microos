SUMMARY = "Performance Co-Pilot archive tools for importing sar data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing sar data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-import-sar2pcp-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "93511b8a271afc766b23b22c3983ecff002192304249637f92507dd701edcfa7a17310c2fb06162119064178c686899ab7a821aa482b46ad58875d63d7cb73dd"

RPROVIDES:${PN} += "pcp-import-sar2pcp"

RDEPENDS:${PN} += "/usr/bin/env \
perl-PCP-LogImport \
sysstat"

inherit rpm
