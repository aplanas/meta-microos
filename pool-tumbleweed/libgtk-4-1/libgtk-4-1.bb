SUMMARY = "The GTK+ toolkit library (version 4)"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.3"

RPM_NAME = "libgtk-4-1-4.10.3-4.1.aarch64.rpm"
RPM_HASH = "ba268e8ac76ca6b53d3eb4768ae327539a55e952c6eff19c518604867de5d4a5d62a33b386e6d91891d607a718cae7e667b6363d501ab681446374a51d6ab219"

RPROVIDES:${PN} += "gtk4 \
libgtk-4-1 \
libgtk-4-1(aarch-64) \
libgtk-4.so.1()(64bit) \
libmedia-gstreamer.so()(64bit) \
libprintbackend-cups.so()(64bit) \
libprintbackend-file.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
adwaita-icon-theme \
gtk4-schema \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
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
libcloudproviders.so.0()(64bit) \
libcolord.so.2()(64bit) \
libcups.so.2()(64bit) \
libepoxy.so.0()(64bit) \
libfontconfig.so.1()(64bit) \
libfribidi.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgraphene-1.0.so.0()(64bit) \
libgstgl-1.0.so.0()(64bit) \
libgstplayer-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libtracker-sparql-3.0.so.0()(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-egl.so.1()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
