SUMMARY = "Graphics file thumbnail generators"
DESCRIPTION = "This package allows KDE applications to show thumbnails \
and previews of graphics files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kdegraphics-thumbnailers-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "1d736f5629d79a6bf45d16b8c0c8b9f229790e5f695b2d759be5f42509f517c16696ded5221cbe4732dcfa8b9bb2f055cf149749021ad1a58a6557fe712aebc1"

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
