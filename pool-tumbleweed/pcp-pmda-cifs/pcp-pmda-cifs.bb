SUMMARY = "Performance Co-Pilot (PCP) metrics for the CIFS protocol"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Common Internet Filesytem."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-cifs-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "359c0fcd1e130fe548b42d5fe3c58ad104a2e55626c105c2fd12d3ac585a2f98fa9299f392bc3ed10b3da6c79f38bc1ed2680015fa6d583e6c8b378452393423"

RPROVIDES:${PN} += "pcp-pmda-cifs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
