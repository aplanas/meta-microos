SUMMARY = "GNOME Bluetooth graphical utilities"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the utilities, data files and manuals for GNOME Bluetooth."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "42.5"

RPM_NAME = "gnome-bluetooth-42.5-1.3.aarch64.rpm"
RPM_HASH = "484f6496ece4947262784110805cd60929dc6771847562125916ce3c3ae5088b1cf306b169a57d1c19a9d0be11ce0cecf085db0a0530123d52011710478612da"

RPROVIDES:${PN} += "application() \
application(bluetooth-sendto.desktop) \
gnome-bluetooth \
gnome-bluetooth(aarch-64)"

RDEPENDS:${PN} += "bluez \
ld-linux-aarch64.so.1()(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-bluetooth-3.0.so.13()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit)"

inherit rpm
