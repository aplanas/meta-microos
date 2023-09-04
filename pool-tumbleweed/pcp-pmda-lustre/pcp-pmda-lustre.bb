SUMMARY = "Performance Co-Pilot (PCP) metrics for the Lustre Filesytem"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Lustre Filesystem."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-lustre-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "3a3f3cc24481537900a99f799813c8badb981a5f95d86edc82130ad19e160fe3a47d3dcea1a46f35d69c1e497139217204c542574eec6cbb0b0afaa416508670"

RPROVIDES:${PN} += "config-pcp-pmda-lustre \
pcp-pmda-lustre"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
