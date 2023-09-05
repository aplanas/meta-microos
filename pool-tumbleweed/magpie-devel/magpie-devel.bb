SUMMARY = "Development files for magpie, a window and compositing manager"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of the magpie library."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.3+0"

RPM_NAME = "magpie-devel-0.9.3+0-2.1.aarch64.rpm"
RPM_HASH = "844d8b9bee5426c42e13554b580efa8b52d799cc23d19480b7624c24910cd17e59c5719259fe3f2e9eaa3467417f13878a2920b9f22364ea23ffdaca451daef6"

RPROVIDES:${PN} += "magpie-devel \
pkgconfig-libmagpie-0 \
pkgconfig-magpie-clutter-0 \
pkgconfig-magpie-cogl-0 \
pkgconfig-magpie-cogl-pango-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
magpie \
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
pkgconfig-gtk+-3.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-magpie-clutter-0 \
pkgconfig-magpie-cogl-0 \
pkgconfig-pango \
pkgconfig-x11 \
pkgconfig-xfixes \
pkgconfig-xi"

inherit rpm
