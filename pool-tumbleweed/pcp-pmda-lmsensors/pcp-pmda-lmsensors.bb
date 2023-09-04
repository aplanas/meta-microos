SUMMARY = "Performance Co-Pilot (PCP) metrics for hardware sensors"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Linux hardware monitoring sensors."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-lmsensors-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "4d37b1783affe333a1d5064d0484ad8e4f25818e7320f12a3d85f1ae3f79700507b69cb74a6ac81ea3057130e5c0d86442958c64e87b9e2a1f0a062e26eda879"

RPROVIDES:${PN} += "pcp-pmda-lmsensors"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
