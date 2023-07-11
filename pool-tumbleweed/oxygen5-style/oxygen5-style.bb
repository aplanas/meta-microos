SUMMARY = "Oxygen style"
DESCRIPTION = "This package contains the libraries of the Oxygen style."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "oxygen5-style-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "ee86aad2e46f823b6ba93f6b99e9bfb7eaf5f43fe0192fbf10d0953dd209e2a84b6615d04c11b56ad5978ac746265bdcd88c92d2311ace7327144d55fbf443eb"

RPROVIDES:${PN} += "liboxygenstyle5.so.5 \
liboxygenstyleconfig5.so.5 \
oxygen-style5 \
oxygen5-style"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5KCMUtils.so.5 \
libKF5Style.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libxcb.so.1 \
qt5qmlimport-QtQuick.2"

inherit rpm
