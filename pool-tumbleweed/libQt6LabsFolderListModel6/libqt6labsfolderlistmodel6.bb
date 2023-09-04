SUMMARY = "Qt 6 LabsFolderListModel library"
DESCRIPTION = "The Qt 6 LabsFolderListModel library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6LabsFolderListModel6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "5ce5cec46f07ff9f1f781c8a94c897809708a6fcf5768faadb40fec6d3781777e62d4f2a8806cb188f7f45969b1b89eea08f2f3b2bb4b972d7f4cf3faa32973e"

RPROVIDES:${PN} += "libQt6LabsFolderListModel.so.6 \
libQt6LabsFolderListModel6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
