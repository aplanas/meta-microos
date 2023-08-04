SUMMARY = "Display gamma configuration"
DESCRIPTION = "This package contains a KDE system settings module to configure display \
gamma."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "kgamma5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "a6ee450df83c4cf5d270cdeb5588ec229ef733a94da26ac42dbfeb246c0972f5ff1b02e25e774ce165a01930ff1d941fc54695ed66023e08a8e772a11c1cc37d"

RPROVIDES:${PN} += "kgamma \
kgamma5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libXxf86vm.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
