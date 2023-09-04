SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Solid5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "160d71c6796f1fb69ddc9628a1c15484dd83fa529f0fa97131f7945658398b57e26753beb459f444be87ddbb0ca6aeaea8928713f4f41684cef9bddbce940dbb"

RPROVIDES:${PN} += "libKF5Solid.so.5 \
libKF5Solid5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libimobiledevice-1.0.so.6 \
libmount.so.1 \
libplist-2.0.so.4 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
