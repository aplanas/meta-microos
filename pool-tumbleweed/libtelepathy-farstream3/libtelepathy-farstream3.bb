SUMMARY = "Telepathy library to handle Call channels"
DESCRIPTION = "Telepathy Farstream is a Telepathy client library that uses Farsight2 \
to handle Call channels."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.2"

RPM_NAME = "libtelepathy-farstream3-0.6.2-2.23.aarch64.rpm"
RPM_HASH = "9322f4870756b03b4d5c060d9f38c0a42faa70b00436ad670f73957e4f71c488296941f3a65f07baa84855f65ee140ebb7cb1d941e27fb83465fa87923054799"

RPROVIDES:${PN} += "libtelepathy-farstream.so.3()(64bit) \
libtelepathy-farstream3 \
libtelepathy-farstream3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-glib-1.so.2()(64bit) \
libfarstream-0.2.so.5()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libtelepathy-glib.so.0()(64bit)"

inherit rpm
