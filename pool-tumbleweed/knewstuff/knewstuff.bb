SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "knewstuff-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "ec8506d122fc1e7a5267744da06fafaee2942bc48d4b49213d85b2ec880818c2870380b2cf5930217c7e532d07e1337bdc312bca51eedd664e7b377dd60b58ec"

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
