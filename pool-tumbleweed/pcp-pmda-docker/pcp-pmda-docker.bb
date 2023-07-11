SUMMARY = "Performance Co-Pilot (PCP) metrics from the Docker daemon"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics using the Docker daemon REST API."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-docker-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "d197425be58391bf2546268f17d6401a9b4574409e02ca92ec874b95f5929a89ae08acd3c8e201053bf96766ceaaabccf6283e45efc93ccb86548e7b6ff0622a"

RPROVIDES:${PN} += "pcp-pmda-docker"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp-web.so.1 \
libpcp.so.3"

inherit rpm
