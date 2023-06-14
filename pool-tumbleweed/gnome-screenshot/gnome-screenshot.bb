SUMMARY = "Utility to take pictures of your screen"
DESCRIPTION = "The screenshot tool captures the screen, a window, or an user-defined \
area and save the snapshot image to a file."
LICENSE = "GPL-2.0-or-later"

PV = "41.0"

RPM_NAME = "gnome-screenshot-41.0-2.7.aarch64.rpm"
RPM_HASH = "76090a22994c2930ff1850ae63091e11ad6bee72199176b161c3f5d18aa304e92b46afb63279a3bc766ccf88c3992cc8fb1fce39d20d15d47d1ba413d739d19e"

RPROVIDES:${PN} += "gnome-screenshot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0"

inherit rpm
