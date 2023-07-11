SUMMARY = "Performance Co-Pilot (PCP) metrics for NFS Clients"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from the SLURM Workload Manager."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-slurm-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "ac62e68745bb8131364a88cc627d1a3a42173c8b6547fb047040c3b0a35d248f5189b0808c983c68101afbf29991a8f78332dd9465ba6f7078dea00c9d5f17d6"

RPROVIDES:${PN} += "pcp-pmda-slurm"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
