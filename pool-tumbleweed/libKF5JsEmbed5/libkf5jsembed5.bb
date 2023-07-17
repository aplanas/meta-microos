SUMMARY = "Method for binding Javascript objects to QObjects"
DESCRIPTION = "KSJEmbed provides a method of binding JavaScript objects to QObjects, \
so you can script your applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5JsEmbed5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "641a9cd519a916d5295b4b6f2e34ead4a34d6d4b01613e9f354e8a467905219d363133ff8c55f55aa027addfa614c450bf7294d5e6eb00b01272ccdc08b6ba20"

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
