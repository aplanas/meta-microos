SUMMARY = "Performance Co-Pilot archive tools for importing MTRG data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing MTRG data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-import-mrtg2pcp-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "1779755f319b0e419943137ec29dc296be7326860880e884b68a6f4a70f83d288dba9e736de06b799338a4323a87f6da533dfe0f6de2fc83acf27765f7f79596"

RPROVIDES:${PN} += "pcp-import-mrtg2pcp"

RDEPENDS:${PN} += "/usr/bin/env \
perl-PCP-LogImport"

inherit rpm
