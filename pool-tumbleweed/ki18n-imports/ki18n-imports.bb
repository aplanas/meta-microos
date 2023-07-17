SUMMARY = "QML components for ki18n Framework"
DESCRIPTION = "This package contains QML imports for the ki18n framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "ki18n-imports-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "983bad8eaa361adefacf22682285e0eb7d3ae85c782a4acb57bb05e938eea3f03b118ebc7c20c9e4b87ada41fd0293b35947f52d52085b8852798ac9b00150b2"

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
