SUMMARY = "Performance Co-Pilot (PCP) metrics for the LIO subsystem"
DESCRIPTION = "This package provides a PMDA to gather performance metrics from the kernels \
iSCSI target interface (LIO). The metrics are stored by LIO within the Linux \
kernels configfs filesystem. The PMDA provides per LUN level stats, and a \
summary instance per iSCSI target, which aggregates all LUN metrics within the \
target."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-lio-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "5cbc28e23affe0a9adf92bfbca107c054140ad3ac7afc435989b9746bfc71f088c91ec7e48587009c307abe950dcc2f37f096d6d0ec56f043bc5faf1dc0b61ef"

RPROVIDES:${PN} += "pcp-pmda-lio"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp \
python3-rtslib-fb"

inherit rpm
