SUMMARY = "Webcam Booth for GNOME"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.1"

RPM_NAME = "cheese-44.0.1-1.1.aarch64.rpm"
RPM_HASH = "d653e27fbbd2be42f2f76d4c872b6a3f41d061450bbb315680e54dc49db4018080d9835a390a97a912e50911414f06ca95b3e874ddc1469143bfcd15395fbd57"

RPROVIDES:${PN} += "application() \
application(org.gnome.Cheese.desktop) \
cheese \
cheese(aarch-64) \
metainfo() \
metainfo(org.gnome.Cheese.appdata.xml)"
RDEPENDS:${PN} += "gnome-video-effects \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libcheese-gtk.so.25()(64bit) \
libcheese.so.8()(64bit) \
libclutter-1.0.so.0()(64bit) \
libclutter-gtk-1.0.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-desktop-3.so.20()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
