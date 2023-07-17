SUMMARY = "Development files for mutter, a window and compositing manager"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of the mutter library."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "mutter-devel-44.3-1.1.aarch64.rpm"
RPM_HASH = "6454f389bb6d0c4112873c0218c54de2ffeb9df68b4f07f18e912952415b12bbaec9700a80e6039821d597e8b5f11aaf3ea07d443aad9badb1f7db3f415d332d"

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
