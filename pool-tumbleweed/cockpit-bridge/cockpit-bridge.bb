SUMMARY = "Cockpit bridge server-side component"
DESCRIPTION = "The Cockpit bridge component installed server side and runs commands on the \
system on behalf of the web based user interface."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-bridge-298-1.1.aarch64.rpm"
RPM_HASH = "58b8296f1f905eb7bcf6a598c009712511391742304fe7a2f640482800b8771a1a3ecfbb0967a7d072f1e536d5dd5261f4aa344529165ccae9d0f7093c558f2c"

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
