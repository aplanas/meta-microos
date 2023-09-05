SUMMARY = "The PimCommon Library"
DESCRIPTION = "The PimCommon library"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5PimCommon5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "bb70dbd0c51b79b2b0c0ff2b1f2a4b47be003fcf941439936d13a8f193d63af312c8be52fed5dee2844bc7140dfb46c759d63107e3dbb31d8fc19ac30aa0d277"

RPROVIDES:${PN} += "libKPim5PimCommon.so.5 \
libKPim5PimCommon5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5Purpose.so.5 \
libKF5PurposeWidgets.so.5 \
libKF5TextAutoCorrectionCore.so.1 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5Libkdepim.so.5 \
libKPim5TextEdit.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
