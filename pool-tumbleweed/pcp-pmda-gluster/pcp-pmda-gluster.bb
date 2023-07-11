SUMMARY = "Performance Co-Pilot (PCP) metrics for the Gluster filesystem"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the gluster filesystem."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-gluster-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "bd8c8300717ec7bece4a3574c3d678a0db27d640917c2336013caf1419c96e01b21be7f4408ce34a16ea6a50393cc53e29406752e1bbb6b5fcc1f05dc793e57c"

RPROVIDES:${PN} += "pcp-pmda-gluster"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
