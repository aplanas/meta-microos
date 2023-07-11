SUMMARY = "Performance Co-Pilot (PCP) metrics for Redis"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from Redis servers (redis.io)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-redis-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "9718ecff4d164a1ba0011b41e4f93cbf1bcd8346935d988a85a877cc5a6e1b870ac2469d774558170de9a4ec7db415c63ac4bcce5b59a77b09fb0c81f1253bf4"

RPROVIDES:${PN} += "pcp-pmda-redis"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
