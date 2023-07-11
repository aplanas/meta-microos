SUMMARY = "Personal Information Manager"
DESCRIPTION = "Kontact combines the individual applications KMail, KAddressBook and \
KOrganizer as views in one window."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kontact-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "92eb09d3b31b0922efa579467a2245446df3900f9623498ba377a015d97243043fd91be46125bc2d9eabd4d8af03ccdb47d38ffbfd8635e3696fed5cd5c422b4"

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
