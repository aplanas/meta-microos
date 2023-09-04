SUMMARY = "Performance Co-Pilot (PCP) metrics for NFS Clients"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from the SLURM Workload Manager."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-slurm-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "534391e5dbb9d238782a85e71eb1e498699f213e3bd4d2e3d25db93d312ff280fb1f3dd1c94482cc17a4324bc3b3eef73381c4453fed84a5e4d6cb6786869819"

RPROVIDES:${PN} += "pcp-pmda-slurm"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
