SUMMARY = "A distraction-free Markdown editor"
DESCRIPTION = "ghostwriter is a text editor for Markdown, which is a plain text \
markup format. For more information about Markdown, please visit John \
Gruber’s website at http://www.daringfireball.net. ghostwriter \
provides a relaxing, distraction-free writing environment."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "ghostwriter-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "659b974405ba9a714117ad43edcc751687e5eafa609593a0fbca9a31efe11e5e6d6c4af92303c1719ca4ad797c9377d057e899de96606f5dc5ff7f8f434bb3d1"

RPROVIDES:${PN} += "ghostwriter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
