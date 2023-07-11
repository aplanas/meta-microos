SUMMARY = "Performance Co-Pilot (PCP) metrics for the room temperature"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the room temperature."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-roomtemp-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "ff3a74a036d32982e52abe74e66e3f9f1aea1850f8bf198088a4dc97fd52f472d4d7472cb6a8750c69a6ac351d1f36b480a77d106ef843944f3966639c2dd3db"

RPROVIDES:${PN} += "pcp-pmda-roomtemp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
pcp"

inherit rpm
