SUMMARY = "Display gamma configuration"
DESCRIPTION = "This package contains a KDE system settings module to configure display \
gamma."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "kgamma5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "4470ae9a10fe408a1158f7bd738d5d4cbd30b6f5eb1ca196f7cca80835f321311cd6da0b0c4e195ec86a041133b43c1248e4537353fd04339d3234ead29e0675"

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
