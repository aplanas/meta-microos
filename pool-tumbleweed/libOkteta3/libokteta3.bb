SUMMARY = "Hex editor/viewer QWidgets libraries"
DESCRIPTION = "Okteta libraries for QWidget-based hex editing widgets."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.13"

RPM_NAME = "libOkteta3-0.26.13-1.1.aarch64.rpm"
RPM_HASH = "bd18666d44648f1c21b54f7c3586fbbede59dfc143a63de06da14786307b1cea1e8f8f49088116da45c462f0b814e7a4089ea83a671d4f1faf5771cf3bcdab5f"

RPROVIDES:${PN} += "libOkteta3 \
libOkteta3Core.so.0 \
libOkteta3Gui.so.0 \
libokteta"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
