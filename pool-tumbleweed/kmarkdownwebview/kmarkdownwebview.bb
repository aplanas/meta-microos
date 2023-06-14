SUMMARY = "KPart for rendering Markdown content"
DESCRIPTION = "This package allows KDE applications which use it to obtain a live preview of HTML-rendered Markdown content."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.6"

RPM_NAME = "kmarkdownwebview-0.5.6-1.12.aarch64.rpm"
RPM_HASH = "180bcbf4cdddd7d14edc84867fba0666aa6cd674fc6c24cab261029e8e4fa193a02eb4d41c8bdde21d69f006c38f32d261c156290bffe2c764619a7e02ac9885"

RPROVIDES:${PN} += "kmarkdownwebview \
libKMarkdownWebView.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5Parts.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
