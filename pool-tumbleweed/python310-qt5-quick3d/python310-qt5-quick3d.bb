SUMMARY = "Python bindings for QtQuick3D"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains the extension for QtQuick3D."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python310-qt5-quick3d-5.15.9-1.4.aarch64.rpm"
RPM_HASH = "d987d07ec4b988fb38bc986accaa79d529564606ce0848657a3528160193840d9c2eb104bc82d8143e831246b6369cffe1587c4e640b5cde034b5efe22c523a2"

RPROVIDES:${PN} += "python3-qt5-quick3d \
python310-qt5-quick3d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Quick3D.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python310-qt5"

inherit rpm
