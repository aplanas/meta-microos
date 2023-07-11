SUMMARY = "KDE Text Editor plugins"
DESCRIPTION = "Kate is an advanced text editor by KDE. This package contains \
plugins and data files for Kate and KWrite editors."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "kate-plugins-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "76601abee8642ee0b07337365feeb834bc095df4a8a02f5baf413663370161490887b8a7fd00735fd9597aca09a500fd1d9a110d1ae5193a48a13c93fd2e9b2f"

RPROVIDES:${PN} += "kate-plugins \
ktexteditorpreviewplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Bookmarks.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NewStuff.so.5 \
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5SyntaxHighlighting.so.5 \
libKF5TextEditor.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libkateprivate.so.23.04.3 \
libstdc++.so.6"

inherit rpm
