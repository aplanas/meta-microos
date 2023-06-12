SUMMARY = "Global desktop keyboard shortcuts"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5GlobalAccelPrivate5-5.106.0-2.1.aarch64.rpm"
RPM_HASH = "a1b17d21aa08d04310e551c18eb3a319bbd5516276e6c86e0db2e6772dba9b5f5d3f23fabcf552f8baa8530b8e6cf9dfcab3ab6210c43705b99518750899d9de"

RPROVIDES:${PN} += "libKF5GlobalAccelPrivate.so.5()(64bit) \
libKF5GlobalAccelPrivate5 \
libKF5GlobalAccelPrivate5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5GlobalAccel.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
