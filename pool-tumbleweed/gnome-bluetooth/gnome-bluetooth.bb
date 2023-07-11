SUMMARY = "GNOME Bluetooth graphical utilities"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the utilities, data files and manuals for GNOME Bluetooth."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "42.5"

RPM_NAME = "gnome-bluetooth-42.5-1.4.aarch64.rpm"
RPM_HASH = "3c47a38a69ef5ddef828e7bb966ca111d684f382c510291d3a3ce6a6f18d8018cb733a3a41017756a8a786e3409d93a40272f165d794cb3610b70e298c4ee0ce"

RPROVIDES:${PN} += "gnome-bluetooth"

RDEPENDS:${PN} += "bluez \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-bluetooth-3.0.so.13 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
