SUMMARY = "The GTK+ toolkit library (version 3)"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "libgtk-3-0-3.24.38-2.1.aarch64.rpm"
RPM_HASH = "5ee491e5f83291dcfcc3f0149e665c14362f7390f5ba6ce2c988f03bca68550a0573d388e3696f546a0b6a7304f0fe9c82b82f1d5da4e3a56eec6f9fd5b3bc23"

RPROVIDES:${PN} += "gtk3 \
libgailutil-3.so.0 \
libgdk-3.so.0 \
libgtk-3-0 \
libgtk-3-0-0 \
libgtk-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gdk-pixbuf-loader-rsvg \
gtk3-data \
gtk3-schema \
gtk3-tools \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libatk-1.0.so.0 \
libatk-bridge-2.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
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
libharfbuzz.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-egl.so.1 \
libxkbcommon.so.0"

inherit rpm
