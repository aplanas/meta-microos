SUMMARY = "GNOME Bluetooth's Shared Libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the GNOME Bluetooth's shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "42.5"

RPM_NAME = "libgnome-bluetooth-ui-3_0-13-42.5-1.4.aarch64.rpm"
RPM_HASH = "063d0c8274beb41a77de2de3569ee1b532e073231ebeade4eb25b49c15560c4a4c133689c359911f287b2692acdd1768b6a42374297db6e5b3fe2644bf1431a4"

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
