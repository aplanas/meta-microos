SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5NewStuff5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "25e29f8fd138d2c52ed25537b9106f632517fdac61087cf7c3ce8709a2a3b9f51cb9313eb0c01b844a906f57f06a0682ef42eb89ac5e5a2036ac0e52ec79daaa"

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
