SUMMARY = "Periodic Table of Elements"
DESCRIPTION = "Kalzium shows a periodic table of the elements."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kalzium-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b4cf7a11ea963195a9d15bd20be7040671c8a4452cbec767be020a554b1e133a33cacf02d0bbe8872212252e6e1455551c2a3869f602b55facefcaefe8267ad8"

RPROVIDES:${PN} += "application() \
application(org.kde.kalzium.desktop) \
application(org.kde.kalzium_cml.desktop) \
kalzium \
kalzium(aarch-64) \
libscience.so.5()(64bit) \
metainfo() \
metainfo(org.kde.kalzium.appdata.xml) \
mimehandler(chemical/x-cml)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Plotting.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5UnitConversion.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Script.so.5()(64bit) \
libQt5Script.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libopenbabel.so.7()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
