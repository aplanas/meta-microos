SUMMARY = "Examples for the qt6-coap modules"
DESCRIPTION = "Examples for the qt6-coap modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-coap-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "abfa2461cbeda7bbbaed69fdd78dc5119755df171c9aac3e78fb919dd18e9646bdaab433789383786e33f8c6bc284d1d1d5215c25d9672da00f52bbf0031ad93"

RPROVIDES:${PN} += "qt6-coap-examples \
qt6-coap-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Coap.so.6()(64bit) \
libQt6Coap.so.6(Qt_6)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
