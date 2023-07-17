SUMMARY = "Convenience classes for QtDBus"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5DBusAddons5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "d289d3158cc6ed57a96124d3a272f6a3ebd02dca2a40bd148d05ee60af0447314e9b3904da0667fd883b19441dcf26446f91c3b2509bfa42ca577dce1d4c4228"

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
