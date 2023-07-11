SUMMARY = "An implementation of the XMLRPC protocol"
DESCRIPTION = "An implementation of the XMLRPC protocol written in C++, based upon XmlRpc++0.7 \
and modified to provide additional XMLRPC variable types. It is used in \
fldigi, flrig, flnet, flmsg, flarq, flamp, fllog, \
a suite of programs written for amateur radio emergency communications. \
Both client and server objects can be used in applications for \
peer-to-peer support."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "libflxmlrpc1-1.0.1-1.9.aarch64.rpm"
RPM_HASH = "f7a99d0c06b4400483dc191ade35f7aeacd7bb49428a84e3c2b0254066f0769d194260595f446b1f1ad8de9a3cc12b900cc7e0e1d9acc94b115c46c79c36ce86"

RPROVIDES:${PN} += "libflxmlrpc.so.1 \
libflxmlrpc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
