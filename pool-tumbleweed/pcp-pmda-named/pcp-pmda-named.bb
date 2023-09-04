SUMMARY = "Performance Co-Pilot (PCP) metrics for Named"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Named nameserver."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-named-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "a01fea3d952abe6a5f3d393373aa9e286f648eb0ad17e1f34c0ae0cf89d1b5bba92f4f70723fa23aee1032fe1edd3d396bd326409d7dd5c329f3a0e4aca16ac4"

RPROVIDES:${PN} += "pcp-pmda-named"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
