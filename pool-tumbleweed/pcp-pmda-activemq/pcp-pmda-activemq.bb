SUMMARY = "Performance Co-Pilot (PCP) metrics for ActiveMQ"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the ActiveMQ message broker."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-activemq-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "e89f005fdbc470347f18a7f6fd32570a3689e0dd042367eb86e779c07fce3f7e64a30519e1e0a1472a0869e3b8d4d8f92f37f93b5efabfb60c225325fbcf98eb"

RPROVIDES:${PN} += "pcp-pmda-activemq \
perl-PCP--ActiveMQ \
perl-PCP--Cache \
perl-PCP--JVMGarbageCollection \
perl-PCP--JVMMemory \
perl-PCP--JVMMemoryPool \
perl-PCP--Queue \
perl-PCP--RESTClient \
perl-PCP--TimeSource"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-LWP--UserAgent \
perl-PCP-PMDA"

inherit rpm
