SUMMARY = "Cockpit bridge server-side component"
DESCRIPTION = "The Cockpit bridge component installed server side and runs commands on the \
system on behalf of the web based user interface."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-bridge-276.1-4.4.aarch64.rpm"
RPM_HASH = "c5ee5d099b0e956531a693f7650ffe0c7aa81ea68e1c6df894c45379674e236373f4e5327c2ac240ac6b1647015d074954179f8c3a899e8e7bdcb94f322067b7"

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
