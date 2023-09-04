SUMMARY = "Performance Co-Pilot (PCP) metrics for the room temperature"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the room temperature."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-roomtemp-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "464160c2febc6bedd17ab0bb7399478bbdc7c36f5d78865669f3c6198f41cc98f8333d01fd94ee9ef7645a31833fa9f32d9fe8a5ce022b18f4b9828c5bc1db9a"

RPROVIDES:${PN} += "pcp-pmda-roomtemp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
pcp"

inherit rpm
