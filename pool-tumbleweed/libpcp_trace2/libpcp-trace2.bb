SUMMARY = "Performance Co-Pilot run-time tracing library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time tracing library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_trace2-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "a03ff04f736c3129a358fbc777df79eb71800eac260d4e1c1673846bea290a020d9868383de23616d7e81b16d21afcbe3a5e980839e145a0f4e9467d1fd3ce65"

RPROVIDES:${PN} += "libpcp-trace.so.2 \
libpcp-trace2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp.so.3"

inherit rpm
