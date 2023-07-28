SUMMARY = "Development files for the Cheese webcam booth"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "cheese-devel-44.1-1.1.aarch64.rpm"
RPM_HASH = "196b850a0096164e2f04560cff652ba626a3208aa570fb43520a5eb29007dc050606c8c000e725f1af5e649957c82e42449075de161398eed4a4b48372f0c116"

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
