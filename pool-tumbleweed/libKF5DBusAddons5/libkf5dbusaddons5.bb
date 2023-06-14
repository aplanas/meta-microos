SUMMARY = "Convenience classes for QtDBus"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5DBusAddons5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "f6e543a0cffea47f98741781c84aa8196cc3a96e0532b378ed6ca89978c5fcb2d9adb5e62d313c3195c30dddef1a6c0b0fb5eae59a68cbe59acc49bfe8ce2bfc"

RPROVIDES:${PN} += "libKF5DBusAddons.so.5 \
libKF5DBusAddons5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5DBus5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
