SUMMARY = "Cockpit PCP integration"
DESCRIPTION = "Cockpit support for reading PCP metrics and loading PCP archives."
LICENSE = "LGPL-2.1-or-later"

PV = "300.1"

RPM_NAME = "cockpit-pcp-300.1-1.1.aarch64.rpm"
RPM_HASH = "8e9cb4295cdb8b7ad14e982f130a4d7b32c6431a022432d29391c6bd8d9dc0d20554c0d2916ce15d389549450d1fdf3449b358cda1d79715af18d83a84f89811"

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
