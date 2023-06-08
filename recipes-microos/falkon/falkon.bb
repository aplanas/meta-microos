SUMMARY = "Modern web browser"
DESCRIPTION = "Falkon is a web browser designed to well integrate with all \
common Linux desktops like GNOME and KDE Plasma. \
It supports current web standards and comes with many features, \
such as an integrated ad blocker. \
 \
It was previously known as QupZilla."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "falkon-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "6fede75811b6ac08f4541fb9cd79e5853a9af83dcbcb7e22c1a686c483a05fdc4180f5f8eeed0d23931aa66f8cdb26db43764a37f8f80c473a0fa45c3b275c96"

RPROVIDES:${PN} += "application() application(org.kde.falkon.desktop) falkon falkon(aarch-64) falkon-gnome-keyring libFalkonPrivate.so.3()(64bit) metainfo() metainfo(org.kde.falkon.appdata.xml) mimehandler(application/x-mimearchive) mimehandler(application/xhtml+xml) mimehandler(text/html) mimehandler(x-scheme-handler/ftp) mimehandler(x-scheme-handler/http) mimehandler(x-scheme-handler/https) qupzilla web_browser"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5QuickWidgets.so.5()(64bit) libQt5QuickWidgets.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Sql5-sqlite libQt5WebChannel.so.5()(64bit) libQt5WebChannel.so.5(Qt_5)(64bit) libQt5WebEngineCore.so.5()(64bit) libQt5WebEngineCore.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxcb.so.1()(64bit)"

inherit rpm
