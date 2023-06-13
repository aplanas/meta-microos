SUMMARY = "Utility to take pictures of your screen"
DESCRIPTION = "The screenshot tool captures the screen, a window, or an user-defined \
area and save the snapshot image to a file."
LICENSE = "GPL-2.0-or-later"

PV = "41.0"

RPM_NAME = "gnome-screenshot-41.0-2.7.aarch64.rpm"
RPM_HASH = "76090a22994c2930ff1850ae63091e11ad6bee72199176b161c3f5d18aa304e92b46afb63279a3bc766ccf88c3992cc8fb1fce39d20d15d47d1ba413d739d19e"

RPROVIDES:${PN} += "application() \
application(org.gnome.Screenshot.desktop) \
gnome-screenshot \
gnome-screenshot(aarch-64) \
metainfo() \
metainfo(org.gnome.Screenshot.metainfo.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit)"

inherit rpm
