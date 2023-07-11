SUMMARY = "Cockpit PCP integration"
DESCRIPTION = "Cockpit support for reading PCP metrics and loading PCP archives."
LICENSE = "LGPL-2.1-or-later"

PV = "293"

RPM_NAME = "cockpit-pcp-293-1.1.aarch64.rpm"
RPM_HASH = "8d23c4074be3c05a93d3d32dff331e911554cd5bd9ca9d2e16390ae10aefc1c445450962a8e8d0dd3c65d589cc3688c4987d00d002f593a34644cd3b41b1a158"

RPROVIDES:${PN} += "cockpit-pcp"

RDEPENDS:${PN} += "/usr/bin/sh \
cockpit-bridge \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libpcp.so.3 \
pcp"

inherit rpm
