SUMMARY = "KDE I/O Slave for Cameras"
DESCRIPTION = "This package contains a KIO slave to access digital cameras."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kio_kamera-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "67b433ca9f20f84f3d3b9b803f6675ffcdb778796bd2a6acd88b98a82cdddf64083b95647159bf04a191afb9d9b292ab269d3af2a68969d2ec08a0755054193a"

RPROVIDES:${PN} += "application() \
application(kcm_kamera.desktop) \
kamera \
kio_kamera \
kio_kamera(aarch-64) \
metainfo() \
metainfo(org.kde.kamera.metainfo.xml)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgphoto2.so.6()(64bit) \
libgphoto2_port.so.12()(64bit) \
libgphoto2_port.so.12(LIBGPHOTO2_5_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
