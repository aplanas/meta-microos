SUMMARY = "Cockpit PCP integration"
DESCRIPTION = "Cockpit support for reading PCP metrics and loading PCP archives."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-pcp-298-1.1.aarch64.rpm"
RPM_HASH = "e0bcde341e92fc4a3321211e15409a23e6fe242cdc9cd7ca0e1738524b6b51b757515ebd5c026fbb52a6fcf7d6d51edec61569b13f2dc66846d3918791c4591b"

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
