SUMMARY = "Qt 6 LabsFolderListModel library"
DESCRIPTION = "The Qt 6 LabsFolderListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsFolderListModel6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "1453625db6a39d378bfbb3382f9b5a994628ea59c93b55def1761f467f9f5f4bf1736bd01a5647609b458ce1441fd085fc920c96be5c6fb7f51c59f2a84c4122"

RPROVIDES:${PN} += "libQt6LabsFolderListModel.so.6 \
libQt6LabsFolderListModel6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
