SUMMARY = "Method for binding Javascript objects to QObjects"
DESCRIPTION = "KSJEmbed provides a method of binding JavaScript objects to QObjects, \
so you can script your applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5JsEmbed5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "a2bbe8b4e9ff1ba0b33b982a0dadbf707a3cc1f904fe619200de06f0121634d07b8fff0b07eba27cc295022763d0137e0958ce9f7459daee6ede40893c6272bd"

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
