SUMMARY = "The GTK+ toolkit library (version 2)"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "libgtk-2_0-0-2.24.33-4.3.aarch64.rpm"
RPM_HASH = "d3cd055e0c8cf0542e70ba07a24ff9323a224c87a53e92214863f318f45bf86af884e5dd9e4769d0028c4267fec95631356c9ba79431a53cdef427046b01d571"

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

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
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
