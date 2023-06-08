SUMMARY = "Cockpit bridge server-side component"
DESCRIPTION = "The Cockpit bridge component installed server side and runs commands on the \
system on behalf of the web based user interface."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-bridge-276.1-4.3.aarch64.rpm"
RPM_HASH = "c75fae7d558231e782cbda106dbcce4de10cbb4da449d7a88cc1465f92d1feb2cacd5143dd2dc54bd83fba29fc71235fed3927549ccc4e2a39644cda7f69c5bf"

RPROVIDES:${PN} += "cockpit-bridge cockpit-bridge(aarch-64) cockpit-ssh"
RDEPENDS:${PN} += "glib-networking ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libpolkit-agent-1.so.0()(64bit) libpolkit-gobject-1.so.0()(64bit) libssh.so.4()(64bit) libssh.so.4(LIBSSH_4_5_0)(64bit) libssh.so.4(LIBSSH_4_7_0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
