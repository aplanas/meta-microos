SUMMARY = "Deepin Tool Kit Core"
DESCRIPTION = "Deepint Tool Kit (Dtk) is the base devlopment tool of all C++/Qt Developer work \
on Deepin. \
 \
You shoud read the [Deepin Application Specification](doc/Specification) \
firstly."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.33"

RPM_NAME = "dtkcore-5.5.33-1.9.aarch64.rpm"
RPM_HASH = "d999bc0a9b20201b4e0cf4f29aea6297271632476032f6a7433498ea883435828683f1177fff44b62da365aa17242f757c2165b2ebfa339822e72c9a0eca13ac"

RPROVIDES:${PN} += "dtkcore"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libdtkcore.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
