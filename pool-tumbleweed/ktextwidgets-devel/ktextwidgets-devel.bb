SUMMARY = "KDE Text editing widgets: Build Environment"
DESCRIPTION = "KTextWidgets provides widgets for displaying and editing text. It supports \
rich text as well as plain text. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "ktextwidgets-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "fc6943831be4c683451f48fe53b7ea34296c77814080e571d44dd1a4d426a2a808a0664d27483369eef5210f4094dc42734d21eb86fb21e5ce466621f3d711b5"

RPROVIDES:${PN} += "cmake-KF5TextWidgets \
ktextwidgets-devel"

RDEPENDS:${PN} += "cmake-KF5I18n \
cmake-KF5Sonnet \
cmake-Qt5Widgets \
extra-cmake-modules \
ld-linux-aarch64.so.1 \
libKF5TextWidgets.so.5 \
libKF5TextWidgets5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
