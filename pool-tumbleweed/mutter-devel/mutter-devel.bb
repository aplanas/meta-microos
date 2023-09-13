SUMMARY = "Development files for mutter, a window and compositing manager"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of the mutter library."
LICENSE = "GPL-2.0-or-later"

PV = "44.4"

RPM_NAME = "mutter-devel-44.4-1.1.aarch64.rpm"
RPM_HASH = "7e421f719d5ced043bbc9083a5a3eb1c3b8318b6b043ecb6836e96495652c82d259a796b1dcb56beb08cb01bf9ae2fef49ed864e15f5746ed0a03286bed1e271"

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
