SUMMARY = "Performance Co-Pilot (PCP) metrics for Simple Network Management Protocol"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about SNMP."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-snmp-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "bfefb90769962218f6a43f8067561fc3fa1f37b725a56ae713416ca337cbec7b64c05c267862d7abd06a71a66d0815df966f418126128eaa81948a9404a9f1f8"

RPROVIDES:${PN} += "pcp-pmda-snmp"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-Net--SNMP \
perl-PCP-PMDA"

inherit rpm
