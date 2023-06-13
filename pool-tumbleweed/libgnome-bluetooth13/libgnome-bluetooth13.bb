SUMMARY = "GNOME Bluetooth's Shared Libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the GNOME Bluetooth's shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.34.5"

RPM_NAME = "libgnome-bluetooth13-3.34.5-2.7.aarch64.rpm"
RPM_HASH = "bae09d4b294a062ebca19a8380d14da2c6745609f618594e2a6bf126b6f86a0a230ca2335e89b8d88ffcd66ea8fd345583db04805274e74f49659ffb47c91e6c"

RPROVIDES:${PN} += "libgnome-bluetooth.so.13()(64bit) \
libgnome-bluetooth13 \
libgnome-bluetooth13(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libcanberra.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libnotify.so.4()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libudev.so.1(LIBUDEV_196)(64bit)"

inherit rpm
