SUMMARY = "The GTK+ toolkit library (version 2)"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "libgtk-2_0-0-2.24.33-4.4.aarch64.rpm"
RPM_HASH = "a88b9b8bf085ec75d810837895b0b24d1de125562f8c7437bc49d0c7342a5cada8ef41c2993c3cde6620b1a0aee75a5e9e7904fc5e2db1bbbe88a28b8d890db6"

RPROVIDES:${PN} += "gail \
gtk2 \
libgail.so \
libgailutil.so.18 \
libgdk-x11-2.0.so.0 \
libgtk-2-0-0 \
libgtk-x11-2.0.so.0 \
libpixmap.so \
libprintbackend-cups.so \
libprintbackend-file.so \
libprintbackend-lpr.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
gtk2-tools \
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
libXrender.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcups.so.2 \
libfontconfig.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0"

inherit rpm
