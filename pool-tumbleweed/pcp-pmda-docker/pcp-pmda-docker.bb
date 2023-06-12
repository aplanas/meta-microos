SUMMARY = "Performance Co-Pilot (PCP) metrics from the Docker daemon"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics using the Docker daemon REST API."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-docker-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "c59fbec94609c3f802f574c15fd6de07e370e34c3a0891a98d1c18e7f154c607a58d65d749cb6372a1b8f848caabee151d9520f81a9b1461204540d60eb7ccfb"

RPROVIDES:${PN} += "pcp-pmda-docker \
pcp-pmda-docker(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpcp.so.3()(64bit) \
libpcp.so.3(PCP_3.0)(64bit) \
libpcp.so.3(PCP_3.21)(64bit) \
libpcp.so.3(PCP_3.22)(64bit) \
libpcp_pmda.so.3()(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) \
libpcp_web.so.1()(64bit) \
libpcp_web.so.1(PCP_WEB_1.1)(64bit) \
libpcp_web.so.1(PCP_WEB_1.2)(64bit)"

inherit rpm
