SUMMARY = "Development files for the Cheese webcam booth"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.1"

RPM_NAME = "cheese-devel-44.0.1-1.2.aarch64.rpm"
RPM_HASH = "29dfa532dee58b96fe22015d720606d6bbf70da885bb4da74110fe8c1e7227ce4200d3250067336466b89c222ede0692b1c3227bd3ef69ec6ae7e3caafcfe606"

RPROVIDES:${PN} += "cheese-devel \
pkgconfig-cheese \
pkgconfig-cheese-gtk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcheese-gtk25 \
libcheese8 \
pkgconfig-clutter-1.0 \
pkgconfig-clutter-gst-3.0 \
pkgconfig-clutter-gtk-1.0 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-pbutils-1.0 \
pkgconfig-gstreamer-plugins-bad-1.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-x11 \
typelib-1-0-Cheese-3-0"

inherit rpm
