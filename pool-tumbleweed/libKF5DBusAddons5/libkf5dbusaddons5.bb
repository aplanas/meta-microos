SUMMARY = "Convenience classes for QtDBus"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5DBusAddons5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "47c4c33fec9b8f9de3387ff6d6dda4a053be2b593950e7df761a2ffb5ddafed9a3874c3229f108cc383c9932ec835bef3ec257e45d99a607f6202fcabd8bfc62"

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
