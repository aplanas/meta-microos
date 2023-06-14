SUMMARY = "Performance Co-Pilot (PCP) metrics for HAProxy"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
extracting performance metrics from HAProxy over the HAProxy stats socket."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-haproxy-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "f5d20535b2fb3e0e2189a20279b9e4e2192890b2d4e5566ab07aadcb6fcb359fa514b49ec416e9e9cad1133f0131535dfe81d4b5b720cfeb8cc7a5df4f622535"

RPROVIDES:${PN} += "pcp-pmda-haproxy"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
python3-pcp"

inherit rpm
