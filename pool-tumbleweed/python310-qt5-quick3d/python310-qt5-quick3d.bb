SUMMARY = "Python bindings for QtQuick3D"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains the extension for QtQuick3D."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python310-qt5-quick3d-5.15.9-3.1.aarch64.rpm"
RPM_HASH = "3aff05d8e48b11ef788bf7b7b9e77cb884ae805a4b7a64b0835ae36f371124282f21b0063f67bb4fed1057b4ce7cbcd75817e223da0ba70a7e844067660863aa"

RPROVIDES:${PN} += "python310-qt5-quick3d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Quick3D.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python310-qt5"

inherit rpm
