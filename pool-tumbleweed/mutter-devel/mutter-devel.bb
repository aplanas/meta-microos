SUMMARY = "Development files for mutter, a window and compositing manager"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of the mutter library."
LICENSE = "GPL-2.0-or-later"

PV = "44.1+2"

RPM_NAME = "mutter-devel-44.1+2-3.1.aarch64.rpm"
RPM_HASH = "af65ded45e743013bb0679e4f44d491a2c87ffea823fd776e75e8be7699c4ce3718cfc2cd8834480b23bbe3b5cac80d6fd6fc94175eebc237105dd057f3ca8fb"

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
