SUMMARY = "Qt 6 LabsFolderListModel library"
DESCRIPTION = "The Qt 6 LabsFolderListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsFolderListModel6-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "1f56868ce204f4fc12e4554fbfcad3d24fd05e2b7fe71fc14078fb913df268d9d1b7384456b4cf5fdb02ce07a43cef32531cb56d7b18ecc23c1eb118b3360b89"

RPROVIDES:${PN} += "libQt6LabsFolderListModel.so.6 \
libQt6LabsFolderListModel6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
