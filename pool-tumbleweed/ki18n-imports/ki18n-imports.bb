SUMMARY = "QML components for ki18n Framework"
DESCRIPTION = "This package contains QML imports for the ki18n framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "ki18n-imports-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "cd6e721f993374bf30726286bbc2a627e201afbab416ba7c625c15f0a1b9f04d5b89236b2daafc470c961ffb4cdfdf4c91652c426d837c760f0006a3e3938797"

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
