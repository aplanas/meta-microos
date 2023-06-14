SUMMARY = "Graphics file thumbnail generators"
DESCRIPTION = "This package allows KDE applications to show thumbnails \
and previews of graphics files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kdegraphics-thumbnailers-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ed7dcdf2966b4cf9b711ea8263e135d8268ebbddfac21651cfe940007a8ae8e547a29c87d26b2603acc641ab8f5818d00e0cfedaa537f34c196250dae3f4dc00"

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
