SUMMARY = "Deepin Tool Kit Core"
DESCRIPTION = "Deepint Tool Kit (Dtk) is the base devlopment tool of all C++/Qt Developer work \
on Deepin. \
 \
You shoud read the [Deepin Application Specification](doc/Specification) \
firstly."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.33"

RPM_NAME = "dtkcore-5.5.33-1.7.aarch64.rpm"
RPM_HASH = "e4bc70402ef90f3b3865d08d02251b558735287dca88673a831c5cf34139a93eedb1e80090bb87e766b74133054757bc2cbf4097b4e657816627bf9d1a81fd5f"

RPROVIDES:${PN} += "dtkcore \
dtkcore(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libdtkcore.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
