SUMMARY = "GNOME Bluetooth's Shared Libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the GNOME Bluetooth's shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "42.6"

RPM_NAME = "libgnome-bluetooth-ui-3_0-13-42.6-1.1.aarch64.rpm"
RPM_HASH = "cdf6cfd1719a9d9f364b3e43a83b0014af5118a6ce264a87af7f1838779477381f0836f22a6c5f7fd79fc0698a7e22f897ee8380c8bedfff50570c42c253814b"

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
