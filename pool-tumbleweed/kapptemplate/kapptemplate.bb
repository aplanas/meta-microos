SUMMARY = "Template for KDE Application Development"
DESCRIPTION = "This package contains templates to start the development of a new KDE \
application/part/plugin."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.1"

RPM_NAME = "kapptemplate-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "2d170aa2b1a08d66efe18ea4610e00e98ff2e0534c21958290ee72f2419c5f7f01575ea5a3086225245c00539b09f1db4070959df8c85b9a88bade7aa9fc935d"

RPROVIDES:${PN} += "kapptemplate \
kapptemplate5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
