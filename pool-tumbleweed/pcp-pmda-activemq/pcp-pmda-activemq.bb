SUMMARY = "Performance Co-Pilot (PCP) metrics for ActiveMQ"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the ActiveMQ message broker."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-activemq-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "ba33a3395a22b121d5c2ad38d014caba67865fd353d0fe9689cd86a785d87513edb1123a20e08e212bf87cb500b04058c1253f657d2c3be9b1422e04f6d7ae88"

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
