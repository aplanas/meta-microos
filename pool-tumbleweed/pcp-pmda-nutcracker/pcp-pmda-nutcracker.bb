SUMMARY = "Performance Co-Pilot (PCP) metrics for NutCracker (TwemCache)"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from NutCracker (TwemCache)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-nutcracker-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "6f3bc000358b1802f57d4b906aba5c0daa23f41249efb8c7b5e73c1558df31d3e129b7d150c0e2eabe87294d4164b135b43b98b0849a44dbef2aacf9da437dfb"

RPROVIDES:${PN} += "config-pcp-pmda-nutcracker \
pcp-pmda-nutcracker"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-JSON \
perl-PCP-PMDA \
perl-YAML--XS--LibYAML"

inherit rpm
