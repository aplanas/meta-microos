SUMMARY = "Qt 6 LabsFolderListModel library"
DESCRIPTION = "The Qt 6 LabsFolderListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsFolderListModel6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "77d093dad31fbc8865452d6e549d2acc28d3a2b5d2b4199855ea6b79d102187f44ff6dfd27a52debc39d2376fcdfe4b0b13f9e8267343865981e2c4e1ceca4b0"

RPROVIDES:${PN} += "libQt6LabsFolderListModel.so.6 \
libQt6LabsFolderListModel6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
