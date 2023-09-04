SUMMARY = "Performance Co-Pilot (PCP) metrics for the sendmail queue"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about email queues managed by sendmail."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-mailq-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "513cfc746055518064d7b7b6bce81675d8a91a538a54e88995222dc7a54196b03730b0a6247dc54f2fbbf9903075bafd3b58f813bca241df97a52850b66d1b7e"

RPROVIDES:${PN} += "pcp-pmda-mailq"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
