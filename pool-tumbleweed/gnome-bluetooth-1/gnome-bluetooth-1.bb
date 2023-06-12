SUMMARY = "GNOME Bluetooth graphical utilities"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the utilities, data files and manuals for GNOME Bluetooth."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.34.5"

RPM_NAME = "gnome-bluetooth-1-3.34.5-2.7.aarch64.rpm"
RPM_HASH = "a9daa1172eaf390f4ba35bfb9629bbdb081bcaeca1640a4710d2d3561797a2d93d4560deb2dcd638ed53452001281768f124c23a124ba0debb2b9231b99219d2"

RPROVIDES:${PN} += "application() \
application(bluetooth-sendto.desktop) \
gnome-bluetooth \
gnome-bluetooth-1 \
gnome-bluetooth-1(aarch-64)"
RDEPENDS:${PN} += "bluez \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-bluetooth.so.13()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
