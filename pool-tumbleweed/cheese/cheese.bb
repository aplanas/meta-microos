SUMMARY = "Webcam Booth for GNOME"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.1"

RPM_NAME = "cheese-44.0.1-1.1.aarch64.rpm"
RPM_HASH = "d653e27fbbd2be42f2f76d4c872b6a3f41d061450bbb315680e54dc49db4018080d9835a390a97a912e50911414f06ca95b3e874ddc1469143bfcd15395fbd57"

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
