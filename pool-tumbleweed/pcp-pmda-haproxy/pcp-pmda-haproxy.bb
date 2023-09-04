SUMMARY = "Performance Co-Pilot (PCP) metrics for HAProxy"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
extracting performance metrics from HAProxy over the HAProxy stats socket."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-haproxy-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "9f3531f7fad9133fb41fd66eff92fcf245dcb2ceff3a946177f52f2509c1bc85297b4a6ab936448e323d7eb5396b3f94e9098435c3bd76bcfffeaae064464149"

RPROVIDES:${PN} += "pcp-pmda-haproxy"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
