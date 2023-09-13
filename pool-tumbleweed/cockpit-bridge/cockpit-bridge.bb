SUMMARY = "Cockpit bridge server-side component"
DESCRIPTION = "The Cockpit bridge component installed server side and runs commands on the \
system on behalf of the web based user interface."
LICENSE = "LGPL-2.1-or-later"

PV = "300.1"

RPM_NAME = "cockpit-bridge-300.1-1.1.aarch64.rpm"
RPM_HASH = "b53072f89493144eaa8609886c78ef5df18fdcb5e95b9b126fd39ff97c7260408800bf5be4d3b78d10dd113a089271a47dd8ffd6bee28933ae807aebcb652a4b"

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
