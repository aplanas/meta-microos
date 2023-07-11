SUMMARY = "Performance Co-Pilot (PCP) metrics for simple network checks"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from simple network checks."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-netcheck-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "b54386309f3544788bd2b309a1b796183d97a8819555a646195bf4fbcf68602513d484e9e774f5dd219afdd7d830eb1fd471cc2c607b8fb8c0f391ab0e4ffcc4"

RPROVIDES:${PN} += "pcp-pmda-netcheck"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
