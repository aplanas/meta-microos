SUMMARY = "Qt 6 LabsFolderListModel library"
DESCRIPTION = "The Qt 6 LabsFolderListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6LabsFolderListModel6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2b6f2d8f00364e164a22259cf2800f8d8c3e29ac043b6c14ed113bb51ab4d111ed1e881bc02984d6c3ab0d6ae1ca2e5f93ed24ff86c20ab3059ab4011fc8f592"

RPROVIDES:${PN} += "libQt6LabsFolderListModel.so.6 \
libQt6LabsFolderListModel6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
