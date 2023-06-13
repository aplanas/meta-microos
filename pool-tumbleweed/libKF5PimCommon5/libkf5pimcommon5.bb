SUMMARY = "The PimCommon Library"
DESCRIPTION = "The PimCommon library"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKF5PimCommon5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "2fffe9d1de7e6e15082422dae0750f282b7507bbd709adeb2da901cd01aecc30396359f386af6c8ba55a34f740bc39e27c9d3ad3220608395bbe4b108b0e6696"

RPROVIDES:${PN} += "libKF5PimCommon.so.5()(64bit) \
libKF5PimCommon5 \
libKF5PimCommon5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5NewStuffWidgets.so.5()(64bit) \
libKF5Purpose.so.5()(64bit) \
libKF5PurposeWidgets.so.5()(64bit) \
libKF5TextAutoCorrection.so.1()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5Libkdepim.so.5()(64bit) \
libKPim5TextEdit.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
