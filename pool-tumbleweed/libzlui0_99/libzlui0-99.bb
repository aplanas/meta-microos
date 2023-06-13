SUMMARY = "Qt5 interface module for ZLibrary"
DESCRIPTION = "This package provides a Qt5-based UI for ZLibrary."
LICENSE = "GPL-2.0+"

PV = "0.99.4"

RPM_NAME = "libzlui0_99-0.99.4-3.27.aarch64.rpm"
RPM_HASH = "09856cca4407cfac29571a3f99f055fa520f2800de72a1494e04a5bacb474203eba14638ad91f19898c792338c921405fda34b956a69a36370f25e26746c7e31"

RPROVIDES:${PN} += "libzlui.so.0.99()(64bit) \
libzlui0_99 \
libzlui0_99(aarch-64) \
zlibrary-ui"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libzlcore.so.0.99()(64bit) \
zlibrary-data"

inherit rpm
