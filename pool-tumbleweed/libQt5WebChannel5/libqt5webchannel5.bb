SUMMARY = "Qt 5 WebChannel Addon"
DESCRIPTION = "Qt WebChannel enables peer-to-peer communication between a server \
(QML/C++ application) and a client (HTML/JavaScript or QML \
application). \
 \
The module provides a JavaScript library for seamless integration of \
C++ and QML applications with HTML/JavaScript and QML clients. The \
clients must use the JavaScript library to access the serialized \
QObjects published by the host applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde3"

RPM_NAME = "libQt5WebChannel5-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "2a33bfacae034e9e6449c7edd6f1317c06524ebe73fe6a260b32483d01bb6c3b44303866ac5b4959e59da09f4287fdbb375b5dd4501c9c5a78091f0960426a03"

RPROVIDES:${PN} += "libQt5WebChannel.so.5 \
libQt5WebChannel5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
