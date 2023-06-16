SUMMARY = "Performance Co-Pilot (PCP) metrics for the Apache webserver"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Apache webserver."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-apache-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "55a77414a938abc8eb05791bdbd11fab34f4830c84609c704a996d7bd927a50bb7beded3fe7575997b313e202aadd8127e510d642add263d941b08a1718f7546"

RPROVIDES:${PN} += "pcp-pmda-apache"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp-web.so.1 \
libpcp.so.3"

inherit rpm
