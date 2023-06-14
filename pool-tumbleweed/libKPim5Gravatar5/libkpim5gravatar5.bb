SUMMARY = "Libgravatar library for KDE PIM applications"
DESCRIPTION = "libgravatar adds support for downloading and displaying gravatars in \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5Gravatar5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "64c7444ae3c8cc523167b5841e89c0a7b980c06543229c7cb1b0855475e978733eefcdd445c40dd73933ae6d6c60f7a63e8de65241057fe19f2d39b86b4347bc"

RPROVIDES:${PN} += "libKPim5Gravatar.so.5 \
libKPim5Gravatar5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5I18n.so.5 \
libKF5PimCommon.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgravatar \
libstdc++.so.6"

inherit rpm
