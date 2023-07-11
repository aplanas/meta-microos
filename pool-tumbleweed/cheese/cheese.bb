SUMMARY = "Webcam Booth for GNOME"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.1"

RPM_NAME = "cheese-44.0.1-1.2.aarch64.rpm"
RPM_HASH = "a0d48bc6c5b58cfe971c2dc2bb495a11ed25bf70fbc8eaef91a368c6f64b743965f35f9d6f18076b1669772c255f3fd567e2ffdd39af1a57db66a3ed95bacfda"

RPROVIDES:${PN} += "cheese"

RDEPENDS:${PN} += "gnome-video-effects \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcanberra-gtk3.so.0 \
libcheese-gtk.so.25 \
libcheese.so.8 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0"

inherit rpm
