SUMMARY = "Performance Co-Pilot (PCP) metrics for VMware"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics for VMware."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-vmware-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "9046c466af72c134f5d99b0b171a4f10a1f0354eed3dca7f747852423f0170913087ca4009235b6e9ee3b545e61b5e978bba9f474a9215f98809cc90a14a9c98"

RPROVIDES:${PN} += "pcp-pmda-vmware"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
