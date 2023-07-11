SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "knewstuff-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "d7ad8a999ab2ed5cd4bec8948822c546e650614f4dd2e2786e406f2030bdb8b46f0a1908d9885b2a2db795cd644c20c4a397365d2c648fced11b15bb7a99aeda"

RPROVIDES:${PN} += "knewstuff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5I18n.so.5 \
libKF5NewStuffCore.so.5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
