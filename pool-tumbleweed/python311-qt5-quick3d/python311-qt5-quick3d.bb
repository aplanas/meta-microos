SUMMARY = "Python bindings for QtQuick3D"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains the extension for QtQuick3D."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python311-qt5-quick3d-5.15.9-3.1.aarch64.rpm"
RPM_HASH = "b41ef40454d596f071c63e0cafac5a9335d654b213ba9ca53d35f816a3660540ba1599276701defc03eb74f28409e10f7e19077d5e80b225637fc0456647e83a"

RPROVIDES:${PN} += "python3-qt5-quick3d \
python311-qt5-quick3d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Quick3D.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python311-qt5"

inherit rpm
