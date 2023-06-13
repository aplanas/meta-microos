SUMMARY = "TODO Application"
DESCRIPTION = "Zanshin Todo is an application for managing your day-to-day actions. \
It helps you organize and reduce the cognitive pressure of what one has to do in his \
job and personal life. You will never forget anything anymore."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "zanshin-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b3ca1fe6c9e49d159b2b990be6cbd7a7c983d274c3d4a964bd5927fc8201d4e69b90a111e19f17f6964e9227842c78fad121916dfff1fcb447c5fd984f613c4d"

RPROVIDES:${PN} += "application() \
application(org.kde.zanshin.desktop) \
metainfo() \
metainfo(org.kde.zanshin.metainfo.xml) \
zanshin \
zanshin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5ItemModels.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5Runner.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5AkonadiWidgets.so.5()(64bit) \
libKPim5KontactInterface.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
