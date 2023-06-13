SUMMARY = "Template for KDE Application Development"
DESCRIPTION = "This package contains templates to start the development of a new KDE \
application/part/plugin."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.1"

RPM_NAME = "kapptemplate-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "2d170aa2b1a08d66efe18ea4610e00e98ff2e0534c21958290ee72f2419c5f7f01575ea5a3086225245c00539b09f1db4070959df8c85b9a88bade7aa9fc935d"

RPROVIDES:${PN} += "application() \
application(org.kde.kapptemplate.desktop) \
kapptemplate \
kapptemplate(aarch-64) \
kapptemplate5 \
metainfo() \
metainfo(org.kde.kapptemplate.appdata.xml)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
