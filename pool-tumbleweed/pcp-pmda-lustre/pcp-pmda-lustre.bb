SUMMARY = "Performance Co-Pilot (PCP) metrics for the Lustre Filesytem"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Lustre Filesystem."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-lustre-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "0501ad590e3d5e1d8ae115e77ec7b979858104225d937a6c367a13537ac1441347783f4ae444f11a2fa48f58f80b4b4aa8c83c4acb5d50d340820503868041d6"

RPROVIDES:${PN} += "config-pcp-pmda-lustre \
pcp-pmda-lustre"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
