SUMMARY = "Modern web browser"
DESCRIPTION = "Falkon is a web browser designed to well integrate with all \
common Linux desktops like GNOME and KDE Plasma. \
It supports current web standards and comes with many features, \
such as an integrated ad blocker. \
 \
It was previously known as QupZilla."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "falkon-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "693bc126950aa95724c813225d6e9e71e9df237b0e95b2a270a3abef0da2ca77de006ac413371a196a83623475bff85474750c090d34759f5517082c7a413e19"

RPROVIDES:${PN} += "application() application(org.kde.falkon.desktop) falkon falkon(aarch-64) falkon-gnome-keyring libFalkonPrivate.so.3()(64bit) metainfo() metainfo(org.kde.falkon.appdata.xml) mimehandler(application/x-mimearchive) mimehandler(application/xhtml+xml) mimehandler(text/html) mimehandler(x-scheme-handler/ftp) mimehandler(x-scheme-handler/http) mimehandler(x-scheme-handler/https) qupzilla web_browser"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5QuickWidgets.so.5()(64bit) libQt5QuickWidgets.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Sql5-sqlite libQt5WebChannel.so.5()(64bit) libQt5WebChannel.so.5(Qt_5)(64bit) libQt5WebEngineCore.so.5()(64bit) libQt5WebEngineCore.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxcb.so.1()(64bit)"

inherit rpm
