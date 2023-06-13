SUMMARY = "Graphics file thumbnail generators"
DESCRIPTION = "This package allows KDE applications to show thumbnails \
and previews of graphics files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kdegraphics-thumbnailers-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ed7dcdf2966b4cf9b711ea8263e135d8268ebbddfac21651cfe940007a8ae8e547a29c87d26b2603acc641ab8f5818d00e0cfedaa537f34c196250dae3f4dc00"

RPROVIDES:${PN} += "kdegraphics-thumbnailers \
kdegraphics-thumbnailers(aarch-64) \
metainfo() \
metainfo(org.kde.kdegraphics-thumbnailers.metainfo.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5KDcraw.so.5()(64bit) \
libKF5KExiv2.so.15.0.0()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libqmobipocket.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
