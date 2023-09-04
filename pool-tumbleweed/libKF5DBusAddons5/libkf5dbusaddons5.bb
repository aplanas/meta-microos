SUMMARY = "Convenience classes for QtDBus"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5DBusAddons5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "0cc6fadea383f5cd48502ea6b33399b9ab32f3beaf2d7c8db1846785076015af2c847a40e1ded18a827a154f324850285e44fa29f95b22df434c67efc86b0fd1"

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
