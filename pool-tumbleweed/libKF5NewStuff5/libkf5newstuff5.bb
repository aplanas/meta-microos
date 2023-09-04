SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5NewStuff5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "ba91bc79a0dc958a136bd2899c2c3a4d1f254331feb791ab664db516c0042cd52cbec5c1c9bff9b584000f2eb0273f4d42813fea6f521cb6776c2f2714b06fce"

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
