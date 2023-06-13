SUMMARY = "YouTube client"
DESCRIPTION = "PlasmaTube allows you to watch YouTube videos on your phone or desktop using a \
elegant user interface integrated with the rest of Plasma."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "plasmatube-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "70b3a104a27a06b8c45b71a26a0fb9554ffd2ac249b2b2e8a82385a8740cf85798e955655eddea48308c336cff26cdf900ee72651f5f5a01d56b777e5288d8d2"

RPROVIDES:${PN} += "application() \
application(org.kde.plasmatube.desktop) \
metainfo() \
metainfo(org.kde.plasmatube.appdata.xml) \
plasmatube \
plasmatube(aarch-64)"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmpv.so.2()(64bit) \
libstdc++.so.6()(64bit) \
yt-dlp"

inherit rpm
