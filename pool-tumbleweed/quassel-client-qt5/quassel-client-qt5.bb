SUMMARY = "Qt5 client for the Quassel IRC client"
DESCRIPTION = "Quassel IRC is a distributed IRC client, meaning that one (or \
multiple) client(s) can attach to and detach from a central core -- \
much like the combination of GNU Screen and a text-based IRC client \
such as WeeChat, but graphical. \
 \
This is the quassel Qt5 client only"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "quassel-client-qt5-0.14.0-1.5.aarch64.rpm"
RPM_HASH = "b44031e1eef0cc9eedc0ac5a9e5a2a9b516b0dbbc9c6408b2525f76ed7b5da612c914ebc5ab7b12604a464d97e81fa38bcc18cb251737f04e3c0b0b713ac4562"

RPROVIDES:${PN} += "quassel-client-qt5 \
quassel-ui"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libKF5SonnetUi.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdbusmenu-qt5.so.2 \
libgcc-s.so.1 \
libsnore-qt5.so.0.7 \
libsnoresettings-qt5.so.0.7 \
libstdc++.so.6 \
libz.so.1 \
quassel-base \
update-alternatives"

inherit rpm
