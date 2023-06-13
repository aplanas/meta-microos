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

RPROVIDES:${PN} += "application() \
application(obconf.desktop) \
mimehandler(application/x-openbox-theme) \
obconf \
obconf(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglade-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libobrender.so.32()(64bit) \
libobt.so.2()(64bit) \
libstartup-notification-1.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
openbox"

inherit rpm
