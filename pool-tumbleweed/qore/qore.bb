SUMMARY = "Multithreaded Programming Language"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic. \
It applies a scripting-based approach to interface development and \
can also be used as a general purpose language."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.16.1"

RPM_NAME = "qore-1.16.1-1.1.aarch64.rpm"
RPM_HASH = "9e4a6cd5bb999f35e1b519582d3f6cee08c4bc92d15d3c9be80aec1e714299d6d021ce1fa2c3a8f5776fd61aea156f940648d0aa21e78ce9f9134e02cde79d1d"

RPROVIDES:${PN} += "qore"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqore.so.12 \
libstdc++.so.6 \
shared-mime-info"

inherit rpm
