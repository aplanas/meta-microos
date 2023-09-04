SUMMARY = "The GTK+ toolkit library (version 4)"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "4.12.0"

RPM_NAME = "libgtk-4-1-4.12.0-2.1.aarch64.rpm"
RPM_HASH = "bb176c99af8ca2634a558ba8341c6b0352fb29b6d8f6a90f3e957c2882389b69b89ea87fc8334d802eeba8c1e61c54912cf5924161eb3532b99a0efb45253dd8"

RPROVIDES:${PN} += "gtk4 \
libgtk-4-1 \
libgtk-4.so.1 \
libmedia-gstreamer.so \
libprintbackend-cups.so \
libprintbackend-file.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
adwaita-icon-theme \
gtk4-schema \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo-script-interpreter.so.2 \
libcairo.so.2 \
libcloudproviders.so.0 \
libcolord.so.2 \
libcups.so.2 \
libepoxy.so.0 \
libfontconfig.so.1 \
libfribidi.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstplayer-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libharfbuzz.so.0 \
libjpeg.so.8 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpng16.so.16 \
libtiff.so.6 \
libtracker-sparql-3.0.so.0 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libxkbcommon.so.0"

inherit rpm
