SUMMARY = "Personal Information Manager"
DESCRIPTION = "Kontact combines the individual applications KMail, KAddressBook and \
KOrganizer as views in one window."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kontact-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "53d8e860043fe0954c6bbe527b8ec1371bd0a12398406db9c174031baa428aa17bda800e16ef3d6ca7b298ac95cf46c6da55e57651dfc836db7563e051c6f59b"

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
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5GrantleeTheme.so.5 \
libKPim5KontactInterface.so.5 \
libKPim5Libkdepim.so.5 \
libKPim5PimCommon.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
