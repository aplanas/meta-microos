SUMMARY = "Auxiliary utilities for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.3"

RPM_NAME = "gtk4-devel-tools-4.10.3-4.1.aarch64.rpm"
RPM_HASH = "9313f25cca3da94ee04a992df56aa199d28b4103d37ae5603a3be69142c057eab71e11d1a32babe9017a5e7d47c57f481022e55bfb70418424745757a1e1c3e3"

RPROVIDES:${PN} += "application() \
application(org.gtk.Demo4.desktop) \
application(org.gtk.IconBrowser4.desktop) \
application(org.gtk.PrintEditor4.desktop) \
application(org.gtk.WidgetFactory4.desktop) \
application(org.gtk.gtk4.NodeEditor.desktop) \
gtk4-devel-tools \
gtk4-devel-tools(aarch-64) \
metainfo() \
metainfo(org.gtk.Demo4.appdata.xml) \
metainfo(org.gtk.IconBrowser4.appdata.xml) \
metainfo(org.gtk.PrintEditor4.appdata.xml) \
metainfo(org.gtk.WidgetFactory4.appdata.xml) \
metainfo(org.gtk.gtk4.NodeEditor.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXcursor.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo-script-interpreter.so.2()(64bit) \
libcairo.so.2()(64bit) \
libepoxy.so.0()(64bit) \
libfontconfig.so.1()(64bit) \
libfribidi.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgraphene-1.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libharfbuzz.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-egl.so.1()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
