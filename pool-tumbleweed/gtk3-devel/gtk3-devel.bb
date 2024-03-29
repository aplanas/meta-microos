SUMMARY = "Development files for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package contains the development files for GTK+ 3.x."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-devel-3.24.38-2.1.aarch64.rpm"
RPM_HASH = "6a45ae544739a680226a9c7ea6bb289b78d3ef50cde11dcf75b86218da904a4f50fc60194fc64e50a7b572763c37c7261929e57e7412c60ecb6a63dca9c0510b"

RPROVIDES:${PN} += "gtk3-devel \
pkgconfig-gail-3.0 \
pkgconfig-gdk-3.0 \
pkgconfig-gdk-broadway-3.0 \
pkgconfig-gdk-wayland-3.0 \
pkgconfig-gdk-x11-3.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-gtk+-broadway-3.0 \
pkgconfig-gtk+-unix-print-3.0 \
pkgconfig-gtk+-wayland-3.0 \
pkgconfig-gtk+-x11-3.0 \
rpm-macro-gtk3-immodule-post \
rpm-macro-gtk3-immodule-postun \
rpm-macro-gtk3-immodule-requires"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gettext-its-gtk3 \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libepoxy.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3-0 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
pkgconfig-atk \
pkgconfig-atk-bridge-2.0 \
pkgconfig-cairo \
pkgconfig-cairo-gobject \
pkgconfig-cairo-xlib \
pkgconfig-epoxy \
pkgconfig-fontconfig \
pkgconfig-fribidi \
pkgconfig-gdk-3.0 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-pango \
pkgconfig-pangocairo \
pkgconfig-pangoft2 \
pkgconfig-wayland-client \
pkgconfig-wayland-cursor \
pkgconfig-wayland-egl \
pkgconfig-x11 \
pkgconfig-xcomposite \
pkgconfig-xcursor \
pkgconfig-xdamage \
pkgconfig-xext \
pkgconfig-xfixes \
pkgconfig-xi \
pkgconfig-xinerama \
pkgconfig-xkbcommon \
pkgconfig-xrandr \
typelib-1-0-Gtk-3-0"

inherit rpm
