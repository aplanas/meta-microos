SUMMARY = "A distraction-free Markdown editor"
DESCRIPTION = "ghostwriter is a text editor for Markdown, which is a plain text \
markup format. For more information about Markdown, please visit John \
Gruber’s website at http://www.daringfireball.net. ghostwriter \
provides a relaxing, distraction-free writing environment."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "ghostwriter-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "659b974405ba9a714117ad43edcc751687e5eafa609593a0fbca9a31efe11e5e6d6c4af92303c1719ca4ad797c9377d057e899de96606f5dc5ff7f8f434bb3d1"

RPROVIDES:${PN} += "application() \
application(org.kde.ghostwriter.desktop) \
ghostwriter \
ghostwriter(aarch-64) \
metainfo() \
metainfo(org.kde.ghostwriter.metainfo.xml) \
mimehandler(text/markdown) \
mimehandler(text/plain) \
mimehandler(text/x-markdown)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5SonnetCore.so.5()(64bit) \
libKF5SonnetUi.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5WebChannel.so.5()(64bit) \
libQt5WebChannel.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
