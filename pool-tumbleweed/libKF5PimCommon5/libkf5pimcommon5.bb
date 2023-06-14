SUMMARY = "The PimCommon Library"
DESCRIPTION = "The PimCommon library"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKF5PimCommon5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "2fffe9d1de7e6e15082422dae0750f282b7507bbd709adeb2da901cd01aecc30396359f386af6c8ba55a34f740bc39e27c9d3ad3220608395bbe4b108b0e6696"

RPROVIDES:${PN} += "libKF5PimCommon.so.5 \
libKF5PimCommon5"

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
libKF5TextAutoCorrection.so.1 \
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
