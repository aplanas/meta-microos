SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5NewStuffWidgets5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "03d0bf739f60503c99cf4dbb079867ecb5d5e4a1b6f792d6e609aff0874f7c6a56ef7d4837c758a7b5647a39ebf8ec9ab98eb0a4ecdbe2451278193e893e5ad9"

RPROVIDES:${PN} += "libKF5NewStuffWidgets.so.5()(64bit) \
libKF5NewStuffWidgets5 \
libKF5NewStuffWidgets5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5NewStuff.so.5()(64bit) \
libKF5NewStuffCore.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm