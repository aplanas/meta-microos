SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "knewstuff-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "54b50ef29960bfda803404ccb4e7a8f1095b5b4b4d0e1dbe0092f8d4346cc1ef4d0548a0855bb2f41cb04389d5d58db37c3af7a00f01bf857aad9a9da933877b"

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
