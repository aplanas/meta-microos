SUMMARY = "Development files for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package contains the development files for GTK+ 4.x."
LICENSE = "LGPL-2.1-or-later"

PV = "4.12.0"

RPM_NAME = "gtk4-devel-4.12.0-2.1.aarch64.rpm"
RPM_HASH = "cd8d64c574e437eaff667f999c52ebba9182a3fa90d541fed8b44f098f7ba8a02e36f5f5044f50599add19543aedbf59557fba7614fd978dcc9ec7a128eb45df"

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
