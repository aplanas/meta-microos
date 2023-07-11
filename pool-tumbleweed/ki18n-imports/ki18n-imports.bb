SUMMARY = "QML components for ki18n Framework"
DESCRIPTION = "This package contains QML imports for the ki18n framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "ki18n-imports-5.107.0-1.3.aarch64.rpm"
RPM_HASH = "380f05026888ffcb0737130e6e834a1ebf4300c54d2615d894fdfa25852780c931111897df05c919749e7d4f9e1c8bd582f48b3f785d0c252c4c8d257b8763c3"

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
