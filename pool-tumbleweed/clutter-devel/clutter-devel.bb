SUMMARY = "Development files for the Clutter library"
DESCRIPTION = "Clutter is a library for creating fast, visually rich and animated \
graphical user interfaces. \
This package contains the files for development."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.4"

RPM_NAME = "clutter-devel-1.26.4-4.10.aarch64.rpm"
RPM_HASH = "b697b59638e94019328cb28483ba446c7ef6d8cd1de82ae80eec45450b63ef2ad22652ce4627b76ecda1130d94e5f047749794034e176e5bec0d077bce34601e"

RPROVIDES:${PN} += "clutter-devel \
clutter-devel(aarch-64) \
clutter-doc \
pkgconfig(cally-1.0) \
pkgconfig(clutter-1.0) \
pkgconfig(clutter-cogl-1.0) \
pkgconfig(clutter-egl-1.0) \
pkgconfig(clutter-gdk-1.0) \
pkgconfig(clutter-glx-1.0) \
pkgconfig(clutter-wayland-1.0) \
pkgconfig(clutter-wayland-compositor-1.0) \
pkgconfig(clutter-x11-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclutter-1_0-0 \
pkgconfig(atk) \
pkgconfig(cairo-gobject) \
pkgconfig(clutter-1.0) \
pkgconfig(cogl-1.0) \
pkgconfig(cogl-pango-1.0) \
pkgconfig(cogl-path-1.0) \
pkgconfig(gdk-3.0) \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(gio-2.0) \
pkgconfig(json-glib-1.0) \
pkgconfig(libinput) \
pkgconfig(libudev) \
pkgconfig(pangocairo) \
pkgconfig(pangoft2) \
pkgconfig(wayland-client) \
pkgconfig(wayland-cursor) \
pkgconfig(wayland-server) \
pkgconfig(x11) \
pkgconfig(xcomposite) \
pkgconfig(xdamage) \
pkgconfig(xext) \
pkgconfig(xi) \
pkgconfig(xkbcommon) \
typelib-1_0-Clutter-1_0"

inherit rpm
