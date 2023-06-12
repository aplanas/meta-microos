SUMMARY = "Performance Co-Pilot archive tools for importing sar data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing sar data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-import-sar2pcp-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "c6501050c411ad888e33adfa6cc5b9ea55983c0b3376409c46a745c270bfe47f14ed36fd648294ad8b9ab65f5337436927aef092014643e1f95e21cf7fb624de"

RPROVIDES:${PN} += "pcp-import-sar2pcp \
pcp-import-sar2pcp(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env \
perl-PCP-LogImport \
sysstat"

inherit rpm
