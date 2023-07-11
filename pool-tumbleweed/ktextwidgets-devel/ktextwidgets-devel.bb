SUMMARY = "KDE Text editing widgets: Build Environment"
DESCRIPTION = "KTextWidgets provides widgets for displaying and editing text. It supports \
rich text as well as plain text. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "ktextwidgets-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "8778c11e892b528669a6f8ad140512467f75649d35b13ef420c7a511b6402069b5a098bd2ca227819ba7d2d8172823976a4f4e43f5c2261fd1b2a62b8ce75bf8"

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
