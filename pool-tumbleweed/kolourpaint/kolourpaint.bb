SUMMARY = "Paint Program"
DESCRIPTION = "Paint program by KDE"
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & GFDL-1.2-or-later & GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "kolourpaint-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "a284ba651093acaf8606ef55b5280fed228a8b0d53efaf2a1123ddd80693c4256095ec8ab51e197d767829df721e80474ff29f015e2a3c804b7d22580a1a850d"

RPROVIDES:${PN} += "kolourpaint \
kolourpaint5 \
libkolourpaint-lgpl.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
kdelibs4support \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5Sane.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
