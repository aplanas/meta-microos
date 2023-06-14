SUMMARY = "An implementation of the XMLRPC protocol"
DESCRIPTION = "An implementation of the XMLRPC protocol written in C++, based upon XmlRpc++0.7 \
and modified to provide additional XMLRPC variable types. It is used in \
fldigi, flrig, flnet, flmsg, flarq, flamp, fllog, \
a suite of programs written for amateur radio emergency communications. \
Both client and server objects can be used in applications for \
peer-to-peer support."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "libflxmlrpc1-1.0.1-1.8.aarch64.rpm"
RPM_HASH = "29494ba78cc43c8a086b923d91678ea1599ae87b4145a425db51d90e52ad2112375ad3e1b16be23e043a5c4023e7a8e0e8a33c8dadbc79b9d1d67a51cd89030f"

RPROVIDES:${PN} += "libflxmlrpc.so.1 \
libflxmlrpc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
