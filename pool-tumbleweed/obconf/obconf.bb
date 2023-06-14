SUMMARY = "Openbox Configuration Tool"
DESCRIPTION = "This is the official application from the Openbox developers to \
configure the Openbox window manager. It is not needed, but highly \
recommended when installing Openbox. \
 \
 \
 \
Authors: \
-------- \
    Ben Jansens <ben@openbox.org> \
    Tim Riley <tr@slackzone.org>"
LICENSE = "GPL-2.0+"

PV = "2.0.4"

RPM_NAME = "obconf-2.0.4-8.32.aarch64.rpm"
RPM_HASH = "7fce90106056512c0432333c6a8086441a8ae59ad68e9db8860d57f99f3e633dabfa69a332c0e810de9fa0193f9b9693e89936aa35498dcb18e2d0215b3f42d2"

RPROVIDES:${PN} += "obconf"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglade-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libobrender.so.32 \
libobt.so.2 \
libstartup-notification-1.so.0 \
libxml2.so.2 \
openbox"

inherit rpm
