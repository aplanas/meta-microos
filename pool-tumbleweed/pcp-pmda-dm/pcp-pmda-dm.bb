SUMMARY = "Performance Co-Pilot (PCP) metrics for the Device Mapper Cache and Thin Client"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Device Mapper Cache and Thin Client."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-dm-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "bcf775a297486a1b41e6ae103f816845a47ad4f90c80c6f189f97a49f15fc765fa631c14ce02519c4bd799f365d8593501c09a7eb0928c52ee6cbf6482a2b9e3"

RPROVIDES:${PN} += "config-pcp-pmda-dm \
pcp-pmda-dm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
