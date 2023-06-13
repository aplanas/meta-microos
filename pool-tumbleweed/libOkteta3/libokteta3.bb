SUMMARY = "Hex editor/viewer QWidgets libraries"
DESCRIPTION = "Okteta libraries for QWidget-based hex editing widgets."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.10"

RPM_NAME = "libOkteta3-0.26.10-1.3.aarch64.rpm"
RPM_HASH = "05ec595ac800e78d56203d6990b7bb80cbb33cb5feb055c5c357fe4426e53a57ae579ffa32c510a6f3b9f9b0da24685cfb193549a6cba0e9e79b1bfb9c47ccfc"

RPROVIDES:${PN} += "libOkteta3 \
libOkteta3(aarch-64) \
libOkteta3Core.so.0()(64bit) \
libOkteta3Gui.so.0()(64bit) \
libokteta"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
