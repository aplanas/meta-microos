SUMMARY = "Shared library for rssguard"
DESCRIPTION = "Shared library for rssguard to be used by external plugins."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-only"

PV = "4.3.4"

RPM_NAME = "librssguard-4_3_4-4.3.4-1.1.aarch64.rpm"
RPM_HASH = "a8170c1d6c124c2336f9bd3d237b8f8ecb57c2c424eaff5fa72b8856b74339cf8bfec8bd5ea60aa1dc27bf1bbe7c9683eecbd1545543917c741ac98efda570ce"

RPROVIDES:${PN} += "librssguard-4-3-4 \
librssguard-4.3.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Sql.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
