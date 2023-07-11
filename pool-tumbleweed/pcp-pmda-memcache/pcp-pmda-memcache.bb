SUMMARY = "Performance Co-Pilot (PCP) metrics for Memcached"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Memcached."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-memcache-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "b7c8375775f6b59b20dad96de15a08097ce77ba5a29f1b91dafe40fa54bb7caf2de42f9b877aa2cfec6571b94e3fbd29a41eb895ef7a2a753fbedc67b794ee65"

RPROVIDES:${PN} += "pcp-pmda-memcache"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
