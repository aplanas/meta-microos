SUMMARY = "Performance Co-Pilot (PCP) metrics from arbitrary log files"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from a specified set of log files (or pipes).  The PMDA \
supports both sampled and event-style metrics."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-logger-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "7cf39fe5f5764fe649dfac3966c1bf766a00d16b2acb48eefc24744b106ef49b8d4c674a13570f341500b87eb6f9ebfa557b6a3f5269b38c048111d7bb0f207a"

RPROVIDES:${PN} += "pcp-pmda-logger"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
