SUMMARY = "Performance Co-Pilot (PCP) metrics from arbitrary log files"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from a specified set of log files (or pipes).  The PMDA \
supports both sampled and event-style metrics."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-logger-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "27ba33d17c39650984bee328e51057b457950c0fa4a198c606011b94125220e6897d9d9b17e5467e5f9d8e64c2ab0e9fd3c93e03c72d000aa7d8e9011e19bd06"

RPROVIDES:${PN} += "pcp-pmda-logger"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
