SUMMARY = "Performance Co-Pilot archive tools for importing ganglia data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing ganglia data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-import-ganglia2pcp-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "2533839751fb43ce57c53f79e033d39d777500e517aca3918ed46a0622b915e55b1d6120a3d46fd3267e177c47bc56dfddae4aab06594898356f267ecedd71c0"

RPROVIDES:${PN} += "pcp-import-ganglia2pcp"

RDEPENDS:${PN} += "/usr/bin/env \
perl-PCP-LogImport"

inherit rpm
