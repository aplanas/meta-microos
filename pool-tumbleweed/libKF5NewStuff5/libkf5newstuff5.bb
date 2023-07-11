SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5NewStuff5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "361812e487eef1436d26795f5acd7f76d6f6af2c7ab3a1e5c2e0443ba1407de664e8df34bb437600bf1ab48253ac6c4c20b3e7f0a29cee9b56179bd9960db769"

RPROVIDES:${PN} += "libKF5NewStuff.so.5 \
libKF5NewStuff5"

RDEPENDS:${PN} += "/sbin/ldconfig \
knewstuff \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5NewStuffCore.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
