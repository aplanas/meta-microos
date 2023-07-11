SUMMARY = "Development files for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package contains the development files for GTK+ 4.x."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.4"

RPM_NAME = "gtk4-devel-4.10.4-1.2.aarch64.rpm"
RPM_HASH = "62e528910cf1f0ee1e149cfca95cbf7c069f64bea2197992d6ef477868e3ef3381bab849c7c493d21beb6e5b1281052c0348afbb1dd9321f714129be52df0ea8"

RPROVIDES:${PN} += "gtk4-devel \
pkgconfig-gtk4 \
pkgconfig-gtk4-broadway \
pkgconfig-gtk4-unix-print \
pkgconfig-gtk4-wayland \
pkgconfig-gtk4-x11 \
rpm-macro-gtk4-immodule-post \
rpm-macro-gtk4-immodule-postun \
rpm-macro-gtk4-immodule-requires"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gettext-its-gtk4 \
gtk4-devel-tools \
gtk4-tools \
libgtk-4-1 \
pkgconfig-cairo \
pkgconfig-cairo-gobject \
pkgconfig-cairo-xlib \
pkgconfig-epoxy \
pkgconfig-fontconfig \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-graphene-gobject-1.0 \
pkgconfig-gtk4 \
pkgconfig-pango \
pkgconfig-pangocairo \
pkgconfig-pangoft2 \
pkgconfig-wayland-client \
pkgconfig-wayland-egl \
pkgconfig-x11 \
pkgconfig-xcursor \
pkgconfig-xdamage \
pkgconfig-xext \
pkgconfig-xfixes \
pkgconfig-xi \
pkgconfig-xinerama \
pkgconfig-xkbcommon \
pkgconfig-xrandr \
typelib-1-0-Gtk-4-0"

inherit rpm
