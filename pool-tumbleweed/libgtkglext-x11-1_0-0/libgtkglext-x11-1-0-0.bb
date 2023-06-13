SUMMARY = "OpenGL Extension to GTK"
DESCRIPTION = "GtkGLExt is an OpenGL extension to GTK. It provides the GDK objects \
that support OpenGL rendering in GTK and GtkWidget API add-ons, to make \
GTK+ widgets OpenGL-capable."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0git20110529"

RPM_NAME = "libgtkglext-x11-1_0-0-1.2.0git20110529-8.3.aarch64.rpm"
RPM_HASH = "89ad1c32dab45f45983c455c5034c036edffdf62be646947119ac1ccea95fd77265fab105942f131940a29fca871a5c3c4902f04f2a05ea1cf4e2313a32f572c"

RPROVIDES:${PN} += "gtkglext \
libgdkglext-x11-1.0.so.0()(64bit) \
libgtkglext-x11-1.0.so.0()(64bit) \
libgtkglext-x11-1_0-0 \
libgtkglext-x11-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
