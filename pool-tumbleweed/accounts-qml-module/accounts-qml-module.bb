SUMMARY = "QML bindings for libaccounts-qt + libsignon-qt"
DESCRIPTION = "This QML module provides an API to manage the user's online accounts and get \
their authentication data. It's a tiny wrapper around the Qt-based APIs of \
libaccounts-qt and libsignon-qt."
LICENSE = "LGPL-2.1-only"

PV = "0.7"

RPM_NAME = "accounts-qml-module-0.7-2.14.aarch64.rpm"
RPM_HASH = "0f4034141dc05df04d37d785268b5dfbcb134d77f8f01ef9dfab85fa21777f6e46d345e60c8efd1124d1090b5694d7da061fe0815bfb8c904681850fd33f2bf3"

RPROVIDES:${PN} += "accounts-qml-module \
libAccounts.so \
qt5qmlimport-Ubuntu.OnlineAccounts.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libaccounts-qt5.so.1 \
libc.so.6 \
libsignon-qt5.so.1 \
libstdc++.so.6"

inherit rpm
