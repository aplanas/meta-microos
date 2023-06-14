SUMMARY = "Single Sign On UI"
DESCRIPTION = "This package contains the user interface for the signond Single Sign On service."
LICENSE = "GPL-3.0-only"

PV = "0.17+20171022"

RPM_NAME = "signon-ui-0.17+20171022-1.23.aarch64.rpm"
RPM_HASH = "396e61268593c68fa79da03ecf04ae8c86ea440c1c269cca3a7e405d858436239123c4728d60c76d84af7e4163f9de9d1d5bf07e58886c484627c2a4f68be05c"

RPROVIDES:${PN} += "signon-ui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5WebChannel5-imports \
libQt5WebEngine.so.5 \
libQt5Widgets.so.5 \
libaccounts-qt5.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnotify.so.4 \
libproxy.so.1 \
libsignon-qt5.so.1 \
libstdc++.so.6"

inherit rpm
