SUMMARY = "Performance Co-Pilot run-time tracing library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time tracing library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_trace2-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "b97a353c0e9bb5b665c16a606911095f31a870952da25e73e23b1a39b34bdf417bd5dcee59cc8d906b320f5183518a1dd5c47c70ad411c2a64fc81717fd0bc6e"

RPROVIDES:${PN} += "libpcp-trace.so.2 \
libpcp-trace2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp.so.3"

inherit rpm
