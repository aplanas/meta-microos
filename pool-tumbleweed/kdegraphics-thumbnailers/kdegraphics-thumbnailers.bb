SUMMARY = "Graphics file thumbnail generators"
DESCRIPTION = "This package allows KDE applications to show thumbnails \
and previews of graphics files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kdegraphics-thumbnailers-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "5dddd72a662d831aaad9aaa13cf9a348d8aaf0ea0478dbd23ee5dd928080ece2bf582e3d25db568687c10e2fce6244ffb2da2c21e575fb35122ee695657a8e81"

RPROVIDES:${PN} += "kdegraphics-thumbnailers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5CoreAddons.so.5 \
libKF5KDcraw.so.5 \
libKF5KExiv2.so.15.0.0 \
libKF5KIOGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libqmobipocket.so.2 \
libstdc++.so.6"

inherit rpm
