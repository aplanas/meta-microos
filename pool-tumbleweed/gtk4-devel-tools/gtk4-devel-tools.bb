SUMMARY = "Auxiliary utilities for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "4.12.0"

RPM_NAME = "gtk4-devel-tools-4.12.0-2.1.aarch64.rpm"
RPM_HASH = "fa39757fba45d9dce679c670ba6e98246b3699af627905f041ea7bf54ebd122c14a1c0c7896aa96d477df3d2652895fb1b501846c83e9ec769fe448aabf6001f"

RPROVIDES:${PN} += "gtk4-devel-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
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
libepoxy.so.0 \
libfontconfig.so.1 \
libfribidi.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libharfbuzz.so.0 \
libjpeg.so.8 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libtiff.so.6 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libxkbcommon.so.0"

inherit rpm
