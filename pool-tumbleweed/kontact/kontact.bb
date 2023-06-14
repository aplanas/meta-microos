SUMMARY = "Personal Information Manager"
DESCRIPTION = "Kontact combines the individual applications KMail, KAddressBook and \
KOrganizer as views in one window."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kontact-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4fe0d503a8817d9a469e57ab85ed26c3f8e360b6d840300517269c3b774b4562adeafcc51745409d7a2edc166aa467c40333b71a56f2ce58b27101eae0c2e8f5"

RPROVIDES:${PN} += "kontact \
kontact5 \
libkontactprivate.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOGui.so.5 \
libKF5Parts.so.5 \
libKF5PimCommon.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5GrantleeTheme.so.5 \
libKPim5KontactInterface.so.5 \
libKPim5Libkdepim.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
