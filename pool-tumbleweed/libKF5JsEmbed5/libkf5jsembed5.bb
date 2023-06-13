SUMMARY = "Method for binding Javascript objects to QObjects"
DESCRIPTION = "KSJEmbed provides a method of binding JavaScript objects to QObjects, \
so you can script your applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5JsEmbed5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "ea19dc9373139eb7ab574d5e4e07019280ba76b2b72d8b345ba6686ca03ba2166d3643e61a9f1611c95e1b467fad87be548e7ed2cd7825cd0ef9bd86b5a69af9"

RPROVIDES:${PN} += "libKF5JsEmbed.so.5()(64bit) \
libKF5JsEmbed5 \
libKF5JsEmbed5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5JS.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
