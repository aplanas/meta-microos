SUMMARY = "GNOME Bluetooth's Shared Libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the GNOME Bluetooth's shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "42.5"

RPM_NAME = "libgnome-bluetooth-ui-3_0-13-42.5-1.3.aarch64.rpm"
RPM_HASH = "5d7e8fea9c2ca368053fd32ae3e758b0451ee028b33bbbc50111859871a06778f6c1b03bf5ee95e99618f7db8642273343c52561e80055410a61f3666c063a43"

RPROVIDES:${PN} += "libgnome-bluetooth-ui-3-0-13 \
libgnome-bluetooth-ui-3.0.so.13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libnotify.so.4 \
libudev.so.1 \
libupower-glib.so.3"

inherit rpm
