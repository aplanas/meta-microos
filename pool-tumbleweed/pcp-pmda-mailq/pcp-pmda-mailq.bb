SUMMARY = "Performance Co-Pilot (PCP) metrics for the sendmail queue"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about email queues managed by sendmail."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-mailq-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "c0ae376f1968f17421399a0d9032e9731bdc1c7039a16723a4c105afff08a11d35bcd6f008c89a10d325db0d2d303e875600d385f38b68c05600b99ae4292647"

RPROVIDES:${PN} += "pcp-pmda-mailq"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
