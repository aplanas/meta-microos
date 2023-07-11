SUMMARY = "A XMPP client based on KDE Framework"
DESCRIPTION = "Kaidan is a simple Jabber/XMPP client providing a user-interface using \
Kirigami and QtQuick. The back-end of Kaidan is entirely written in C++ \
using the qxmpp XMPP client library and Qt 5."
LICENSE = "AML & GPL-3.0-or-later & SUSE-GPL-3.0+-with-openssl-exception & MIT & CC-BY-SA-4.0"

PV = "0.9.1"

RPM_NAME = "kaidan-0.9.1-1.2.aarch64.rpm"
RPM_HASH = "92c68ac3f67d43525d3e9e79ad9f48640d4d39048b3accca29810f8f0642a51d19b3d978419cce8112ee2132fc0472460a59641c9cc6e83a4bbef2fee078c1d5"

RPROVIDES:${PN} += "kaidan"

RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
kquickimageeditor-imports \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5ItemViews.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libQXmppOmemo.so.4 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Positioning.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libZXing.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libqt5-qtquickcontrols2 \
libqxmpp.so.4 \
libstdc++.so.6"

inherit rpm
