SUMMARY = "Performance Co-Pilot (PCP) metrics for the Gluster filesystem"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the gluster filesystem."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-gluster-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "f35cbd7756da0cdf4eddc1be141a60ed49256f9cb6afe2222f442292ad0c2b9b6ddb7b365967f04e209be24e4f962ad633622c6a7d3936d038145931860c0cc1"

RPROVIDES:${PN} += "pcp-pmda-gluster"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
