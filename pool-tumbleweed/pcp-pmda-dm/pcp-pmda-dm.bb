SUMMARY = "Performance Co-Pilot (PCP) metrics for the Device Mapper Cache and Thin Client"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Device Mapper Cache and Thin Client."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-dm-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "8c442959539a023140f3fd92c26deda35170bf35e6eb9965f9941869422c40c7155d65d8eb718635cee48b6823dc5df19767049ab7989d8e8d1c5b18deee859f"

RPROVIDES:${PN} += "config-pcp-pmda-dm \
pcp-pmda-dm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
