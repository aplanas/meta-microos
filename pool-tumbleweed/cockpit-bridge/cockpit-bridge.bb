SUMMARY = "Cockpit bridge server-side component"
DESCRIPTION = "The Cockpit bridge component installed server side and runs commands on the \
system on behalf of the web based user interface."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-bridge-298-2.1.aarch64.rpm"
RPM_HASH = "b697be6e681e85c55d22a61b0cfe5dae7562de478bf3068b185b0196ce8807a1dca3a23bf0c3d1b0d3d4b12a86280c1e252ee72ef110b039e5c20d2ab8f84f1d"

RPROVIDES:${PN} += "cockpit-bridge \
cockpit-ssh"

RDEPENDS:${PN} += "glib-networking \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
libssh.so.4 \
libsystemd.so.0"

inherit rpm
