SUMMARY = "Performance Co-Pilot (PCP) metrics from the Docker daemon"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics using the Docker daemon REST API."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-docker-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "ce3508c509727b225ecdcd5b4822b8a035b0ffa456554a5327357a9f36e45826ce93018f4556525fc5d965aa3206fd412225454948f8c6c949f0e37f4f8cafd1"

RPROVIDES:${PN} += "pcp-pmda-docker"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp-web.so.1 \
libpcp.so.3"

inherit rpm
