SUMMARY = "Performance Co-Pilot (PCP) metrics for NFS Clients"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from the SLURM Workload Manager."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-slurm-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "5803c39ca5ece864d5f92de47fbdb5e61c831568aef60addcb728315996a401261bc129b3efe4114bcc5da442acdd6570de60c52e91d5f2d32ab0a216f59ed81"

RPROVIDES:${PN} += "pcp-pmda-slurm"

RDEPENDS:${PN} += "/bin/sh \
perl-PCP-PMDA"

inherit rpm
