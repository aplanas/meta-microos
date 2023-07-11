SUMMARY = "Development files for mutter, a window and compositing manager"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of the mutter library."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "mutter-devel-44.2-1.1.aarch64.rpm"
RPM_HASH = "aa4c299139c388f51ffb267b9627b7879260fa1dfb7e3b5e5663fb7a2e292d10c4ddbf4f59ef75de26613dcd7c386ffe8aff8973b6d31c645a240c6a4df7d228"

RPROVIDES:${PN} += "mutter-devel \
pkgconfig-libmutter-12 \
pkgconfig-mutter-clutter-12 \
pkgconfig-mutter-cogl-12 \
pkgconfig-mutter-cogl-pango-12"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mutter \
pkgconfig-atk \
pkgconfig-cairo \
pkgconfig-cairo-gobject \
pkgconfig-egl \
pkgconfig-gio-unix-2.0 \
pkgconfig-gl \
pkgconfig-glesv2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-graphene-gobject-1.0 \
pkgconfig-gsettings-desktop-schemas \
pkgconfig-harfbuzz \
pkgconfig-json-glib-1.0 \
pkgconfig-mutter-clutter-12 \
pkgconfig-mutter-cogl-12 \
pkgconfig-pango \
pkgconfig-pangocairo \
pkgconfig-wayland-server \
pkgconfig-x11 \
pkgconfig-xfixes \
pkgconfig-xi"

inherit rpm
