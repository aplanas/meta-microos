SUMMARY = "Performance Co-Pilot (PCP) metrics from the Docker daemon"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics using the Docker daemon REST API."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-docker-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "c59fbec94609c3f802f574c15fd6de07e370e34c3a0891a98d1c18e7f154c607a58d65d749cb6372a1b8f848caabee151d9520f81a9b1461204540d60eb7ccfb"

RPROVIDES:${PN} += "pcp-pmda-docker"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp-web.so.1 \
libpcp.so.3"

inherit rpm
