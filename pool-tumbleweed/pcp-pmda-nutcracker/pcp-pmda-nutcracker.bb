SUMMARY = "Performance Co-Pilot (PCP) metrics for NutCracker (TwemCache)"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from NutCracker (TwemCache)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-nutcracker-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "b7c189966aef5ba334ba36d613d39fdd63cc046acc2788a9ac78139b6521b12caec91395505c165a854b347f570d8dac36dc92302e40b9cf21c2b2d8a5b22090"

RPROVIDES:${PN} += "config-pcp-pmda-nutcracker \
pcp-pmda-nutcracker"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-JSON \
perl-PCP-PMDA \
perl-YAML--XS--LibYAML"

inherit rpm
