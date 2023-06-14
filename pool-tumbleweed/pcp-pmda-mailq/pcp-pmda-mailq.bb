SUMMARY = "Performance Co-Pilot (PCP) metrics for the sendmail queue"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about email queues managed by sendmail."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-mailq-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "e9d96afdf3514a0fd8919fec6fdcbe6261f8dea6c0e1b2f2095218b9df3d7e8c0f7dced6618ed4c432d8cc2975badf14a3e2be5ede1d1ca871613f4fa4527d20"

RPROVIDES:${PN} += "pcp-pmda-mailq"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
