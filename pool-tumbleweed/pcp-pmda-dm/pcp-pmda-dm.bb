SUMMARY = "Performance Co-Pilot (PCP) metrics for the Device Mapper Cache and Thin Client"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Device Mapper Cache and Thin Client."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-dm-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "7fda5323190959c8dffbd819405077310490329e66d7144d36f03e33ad18d3c78eaf7801aa2dd2cf56d2e15a40748a5fdc398e775a3b2165ca4a8eb4adcb2412"

RPROVIDES:${PN} += "config-pcp-pmda-dm \
pcp-pmda-dm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
