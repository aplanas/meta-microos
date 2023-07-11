SUMMARY = "Performance Co-Pilot (PCP) metrics for the Apache webserver"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Apache webserver."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-apache-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "b140ef407d2fc02bcb63c0ec8aa24efd696c03039a34a9c3bdf1d5307176e542bfaa51d6c9fd70ba333b3b4fc3d0f50af0270f2c6c8d103d30ff052208fd32d4"

RPROVIDES:${PN} += "pcp-pmda-apache"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp-web.so.1 \
libpcp.so.3"

inherit rpm
