SUMMARY = "Muffin development files"
DESCRIPTION = "Cinnamon Desktop default window manager. \
Muffin uses GTK+ and Clutter to do everything. \
 \
This package provides the development files."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.2.1"

RPM_NAME = "muffin-devel-5.2.1-1.1.aarch64.rpm"
RPM_HASH = "12f28a26c26ba3bc387a6ec4984ce4c12c0ca754f6f3c85b384eb48ff98cb3edce1db538afea7493148897eeb7e05b3a5fb32f0aae60e989ba8c50a3792260b6"

RPROVIDES:${PN} += "muffin-devel \
pkgconfig-libmuffin \
pkgconfig-muffin-clutter-0 \
pkgconfig-muffin-clutter-x11-0 \
pkgconfig-muffin-cogl-0 \
pkgconfig-muffin-cogl-pango-0 \
pkgconfig-muffin-cogl-path-0 \
pkgconfig-muffin-plugins"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmuffin.so.0 \
libmuffin0 \
libpango-1.0.so.0 \
pkgconfig-atk \
pkgconfig-cairo \
pkgconfig-cairo-gobject \
pkgconfig-cinnamon-desktop \
pkgconfig-egl \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-muffin-clutter-0 \
pkgconfig-muffin-cogl-0 \
pkgconfig-pangocairo \
pkgconfig-pangoft2 \
pkgconfig-x11 \
pkgconfig-xcomposite \
pkgconfig-xdamage \
pkgconfig-xext \
pkgconfig-xfixes \
pkgconfig-xi \
pkgconfig-xrandr \
pkgconfig-xtst \
typelib-1-0-Muffin-0-0"

inherit rpm
