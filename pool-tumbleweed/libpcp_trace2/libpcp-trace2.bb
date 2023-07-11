SUMMARY = "Performance Co-Pilot run-time tracing library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time tracing library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_trace2-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "8e69c7d39cadb7ae511134e9c430d274dc94cf55f3637de460a58e68724b71a504c10095cabb8d30d6a3df3ff3a7c050466210d7f7d6843636b757c9059df474"

RPROVIDES:${PN} += "libpcp-trace.so.2 \
libpcp-trace2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp.so.3"

inherit rpm
