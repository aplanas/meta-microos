SUMMARY = "Performance Co-Pilot (PCP) metrics for the Gluster filesystem"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the gluster filesystem."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-gluster-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "48fbe33f666c60a0baf09153d14b2c7315432a4a3631dd6b75dc3f87ca5d814bcfc3850f9b329b31c434e8602c16e1294472dbafdbe6ee753f2cd35fb570db34"

RPROVIDES:${PN} += "pcp-pmda-gluster"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
