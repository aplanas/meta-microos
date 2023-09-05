SUMMARY = "Development files for mutter, a window and compositing manager"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of the mutter library."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "mutter-devel-44.3-4.1.aarch64.rpm"
RPM_HASH = "836161ea6dadec3b1e08afe03ebd2c9c151e09ca6472c03c221e965a73adf6d4b0cad4d97e5d9c6da026f269723eee4b8f46d677a2c29241cea4c0a2a025e8f8"

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
