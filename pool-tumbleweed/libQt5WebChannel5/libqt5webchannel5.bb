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

PV = "5.15.9+kde3"

RPM_NAME = "libQt5WebChannel5-5.15.9+kde3-1.1.aarch64.rpm"
RPM_HASH = "a23d2dfa716f05099450ce167363f0727156b6fde14dd6a4a4012983d1f155b803ff22de56ed1e276103bb5181539f938de8ee423815a4ac2c5a62fe6973094a"

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
