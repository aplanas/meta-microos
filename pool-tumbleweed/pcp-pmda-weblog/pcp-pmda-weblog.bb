SUMMARY = "Performance Co-Pilot (PCP) metrics from web server logs"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about web server logs."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-weblog-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "4740953c908b337c5b18b3d870e3df34ac6d34697aa920c9179517133f56e7ad0cd2d47016fe2be436b1bcdda84c12dd2c13ceaea0b806981931d9f1ff15b8fc"

RPROVIDES:${PN} += "pcp-pmda-weblog"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
pcp"

inherit rpm
