SUMMARY = "Framework for integration of KDE frameworks widgets with Qt Designer"
DESCRIPTION = "This framework provides plugins for Qt Designer that allow it to display \
the widgets provided by various KDE frameworks, as well as a utility \
(kgendesignerplugin) that can be used to generate other such plugins \
from ini-style description files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kdesignerplugin-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "543d3e49dd0852a1da8dc8da603e7db4b6c3896007600aa39287d6ce4804f2f3fbd59745bdeb0c6f79961415debc111978274807c18ca2d891d957e6d4ca7726"

RPROVIDES:${PN} += "kdesignerplugin"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
