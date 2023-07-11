SUMMARY = "QtQuick bindings for classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. KCModules can be \
created with the KConfigWidgets framework. This package provides QtQuick bindings \
for the KCMUtils libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kcmutils-imports-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "3db050943515d3d7c29cd6eb7d55db590c3f4acfdf2d5baf43a6e01f929c136b096209fbcdf70e3e4d3af6a2c77f00150473892fd77081421359fb43439f4364"

RPROVIDES:${PN} += "kcmutils-imports \
libkcmutilsqmlplugin.so \
qt5qmlimport-org.kde.kcmutils.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ItemViews.so.5 \
libKF5KCMUtils5 \
libKF5KCMUtilsCore5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2"

inherit rpm
