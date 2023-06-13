SUMMARY = "Personal Information Manager"
DESCRIPTION = "Kontact combines the individual applications KMail, KAddressBook and \
KOrganizer as views in one window."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kontact-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4fe0d503a8817d9a469e57ab85ed26c3f8e360b6d840300517269c3b774b4562adeafcc51745409d7a2edc166aa467c40333b71a56f2ce58b27101eae0c2e8f5"

RPROVIDES:${PN} += "application() \
application(org.kde.kontact.desktop) \
kontact \
kontact(aarch-64) \
kontact5 \
libkontactprivate.so.5()(64bit) \
metainfo() \
metainfo(org.kde.kontact.appdata.xml)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5PimCommon.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5GrantleeTheme.so.5()(64bit) \
libKPim5KontactInterface.so.5()(64bit) \
libKPim5Libkdepim.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
