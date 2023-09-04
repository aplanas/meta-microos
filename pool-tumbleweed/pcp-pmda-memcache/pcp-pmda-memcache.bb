SUMMARY = "Performance Co-Pilot (PCP) metrics for Memcached"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Memcached."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-memcache-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "c873b8e6f7ccafafb4b24612edc5624652b72bed8e277585d26c1d97e49cd4c1e318074066d1ba705d6273c5e78f17680691f1c612eb8f4a6bee37d76b7857e1"

RPROVIDES:${PN} += "pcp-pmda-memcache"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
