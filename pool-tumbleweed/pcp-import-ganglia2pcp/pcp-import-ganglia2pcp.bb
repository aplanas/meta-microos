SUMMARY = "Performance Co-Pilot archive tools for importing ganglia data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing ganglia data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-import-ganglia2pcp-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "29ab37be6d370c82ca3f92c7e8b07c450fa12f72a96183774e716b02ade760e0665b0c357ef60b6c0428268ad69c220106d19186822f54f556e1693e0fb57e8f"

RPROVIDES:${PN} += "pcp-import-ganglia2pcp"

RDEPENDS:${PN} += "/usr/bin/env \
perl-PCP-LogImport"

inherit rpm
