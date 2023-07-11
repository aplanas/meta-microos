SUMMARY = "Cockpit bridge server-side component"
DESCRIPTION = "The Cockpit bridge component installed server side and runs commands on the \
system on behalf of the web based user interface."
LICENSE = "LGPL-2.1-or-later"

PV = "293"

RPM_NAME = "cockpit-bridge-293-1.1.aarch64.rpm"
RPM_HASH = "ae0bad209ee16e5367ddd03cc306157395e780c6eb969402764152fb330e4b5e9563ca628dab855c197a87eb95863219739dd1d0b68a3f611117088df86447b5"

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
