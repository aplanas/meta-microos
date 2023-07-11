SUMMARY = "Python bindings for QtQuick3D"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains the extension for QtQuick3D."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python39-qt5-quick3d-5.15.9-3.1.aarch64.rpm"
RPM_HASH = "efeda35dee7feadced9287d4e2290baaadcc0f939473afc9dc2b16eedfe4e6873d257301881478a1c26f362e8f1420c7a5863fb4accf2ae4c66e7c145244909e"

RPROVIDES:${PN} += "python39-qt5-quick3d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Quick3D.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python39-qt5"

inherit rpm
