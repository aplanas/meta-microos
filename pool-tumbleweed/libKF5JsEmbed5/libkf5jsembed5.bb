SUMMARY = "Method for binding Javascript objects to QObjects"
DESCRIPTION = "KSJEmbed provides a method of binding JavaScript objects to QObjects, \
so you can script your applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5JsEmbed5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "183de51ed2de0a946e88acbedbe9415755fdeaa09850df97f55d02bc2cf44cf5ab93a0c900a4ce0c7508407dbc41261d2b197cde8df6ff9c72f7246246c8f420"

RPROVIDES:${PN} += "libKF5JsEmbed.so.5 \
libKF5JsEmbed5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5JS.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
