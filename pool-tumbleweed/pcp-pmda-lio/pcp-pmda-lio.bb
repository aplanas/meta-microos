SUMMARY = "Performance Co-Pilot (PCP) metrics for the LIO subsystem"
DESCRIPTION = "This package provides a PMDA to gather performance metrics from the kernels \
iSCSI target interface (LIO). The metrics are stored by LIO within the Linux \
kernels configfs filesystem. The PMDA provides per LUN level stats, and a \
summary instance per iSCSI target, which aggregates all LUN metrics within the \
target."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-lio-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "6263a6a1db2d83697d8159b20618e059be008f25d1cc2922b05701117b41ccad25a0293d6a7a659e7e5a136d1fd04bee5eabc0e6fb1ccc8b4a9d76839eec495c"

RPROVIDES:${PN} += "pcp-pmda-lio"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp \
python3-rtslib-fb"

inherit rpm
