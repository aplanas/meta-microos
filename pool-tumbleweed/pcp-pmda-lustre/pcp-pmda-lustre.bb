SUMMARY = "Performance Co-Pilot (PCP) metrics for the Lustre Filesytem"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Lustre Filesystem."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-lustre-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "e0cffea022788d89869241d60a2ebbd8987c1d5147b5d5c7352f093db1596ec18c023ac7e805e79c1ece0814642d100cc64764b5a0037f011616ce514af37c7b"

RPROVIDES:${PN} += "config-pcp-pmda-lustre \
pcp-pmda-lustre"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
