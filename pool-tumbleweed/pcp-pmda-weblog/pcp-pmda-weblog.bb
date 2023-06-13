SUMMARY = "Performance Co-Pilot (PCP) metrics from web server logs"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about web server logs."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-weblog-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "e07996f95863a188d2b36d9ddef8db68ea9ee497f1b41a0481a1192de3b63ba7ff9939a392b4b22f02d5deb76e1561c70c21984363f234b6be7fa1ff5c66a151"

RPROVIDES:${PN} += "pcp-pmda-weblog \
pcp-pmda-weblog(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
pcp"

inherit rpm
