SUMMARY = "QML components for ki18n Framework"
DESCRIPTION = "This package contains QML imports for the ki18n framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "ki18n-imports-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "42fe96610b1c94c8d36e7abf33b225eaf874d4b043d8ceccc9ea0e4280aa86f5bed31db5d19df1972ec887876e4093aa7b5c43dff9befce199de12d3150781c8"

RPROVIDES:${PN} += "ki18n-imports \
libki18nlocaledataqmlplugin.so \
qt5qmlimport-org.kde.i18n.localeData.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5I18nLocaleData.so.5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
