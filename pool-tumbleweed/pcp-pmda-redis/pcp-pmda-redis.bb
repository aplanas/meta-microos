SUMMARY = "Performance Co-Pilot (PCP) metrics for Redis"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from Redis servers (redis.io)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-redis-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "00123745ddf3392e0e24753aa9af8669749e1b3b00c381c4aaaecfcdcfa91be2c9452dfda54997dcd7ad7aad6bd19322956d41b69c28a7f8c935358f11eb1ea1"

RPROVIDES:${PN} += "pcp-pmda-redis"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
