SUMMARY = "QML bindings for libaccounts-qt + libsignon-qt"
DESCRIPTION = "This QML module provides an API to manage the user's online accounts and get \
their authentication data. It's a tiny wrapper around the Qt-based APIs of \
libaccounts-qt and libsignon-qt."
LICENSE = "LGPL-2.1-only"

PV = "0.7"

RPM_NAME = "accounts-qml-module-0.7-2.15.aarch64.rpm"
RPM_HASH = "e00c0cec7523f85384eb9e4f47f8c659cd199f082843f255aa695faf72d4d939a1a315b3c57d465038e0bb74ce96dd214bdabe8688c7e2fd2f1b6f0a7fcc37a6"

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
