SUMMARY = "Performance Co-Pilot archive tools for importing sar data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing sar data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-import-sar2pcp-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "0bb231a0154664c57ca5061c17628742a2a380fab6dd4ddc58d0c3f3e4b53698c29adc831267b61464db89dd68d495092ec72c43b2e5ccba125d4d986a7f9c21"

RPROVIDES:${PN} += "pcp-import-sar2pcp"

RDEPENDS:${PN} += "/usr/bin/env \
perl-PCP-LogImport \
sysstat"

inherit rpm
