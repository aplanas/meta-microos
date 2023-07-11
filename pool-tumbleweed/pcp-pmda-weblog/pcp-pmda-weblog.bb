SUMMARY = "Performance Co-Pilot (PCP) metrics from web server logs"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about web server logs."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-weblog-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "e9e605e21f21eedb10dec28a6e905e5c44b0eb17ad7ac2b64f43249bcd0cdad9323b6c4088f08c847b57314bcb1508f355c83dad77be311f4dc00829e0d457d3"

RPROVIDES:${PN} += "pcp-pmda-weblog"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
pcp"

inherit rpm
