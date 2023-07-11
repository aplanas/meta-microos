SUMMARY = "Devel"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "spice-gtk-devel-0.42-1.5.aarch64.rpm"
RPM_HASH = "38e5fb4a9f3f2a6a6ae9fdde40abaca73b8360c268482f1e96d9b55c5410c9a9eb2ffcf9347c0e0869f0550f17de50a26326801617583001fa58d4c2fe5f226a"

RPROVIDES:${PN} += "pkgconfig-spice-client-glib-2.0 \
pkgconfig-spice-client-gtk-3.0 \
spice-gtk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspice-client-glib-2-0-8 \
libspice-client-gtk-3-0-5 \
pkgconfig-epoxy \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gobject-introspection-1.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-app-1.0 \
pkgconfig-gstreamer-audio-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gstreamer-video-1.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-libcacard \
pkgconfig-libjpeg \
pkgconfig-liblz4 \
pkgconfig-libphodav-3.0 \
pkgconfig-libsasl2 \
pkgconfig-libsoup-3.0 \
pkgconfig-libusb-1.0 \
pkgconfig-libusbredirhost \
pkgconfig-libusbredirparser-0.5 \
pkgconfig-openssl \
pkgconfig-opus \
pkgconfig-pixman-1 \
pkgconfig-spice-client-glib-2.0 \
pkgconfig-spice-protocol \
pkgconfig-wayland-client \
pkgconfig-wayland-cursor \
pkgconfig-wayland-server \
pkgconfig-x11 \
pkgconfig-zlib \
typelib-1-0-SpiceClientGlib-2-0 \
typelib-1-0-SpiceClientGtk-3-0"

inherit rpm
