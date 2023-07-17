SUMMARY = "KDE Text editing widgets: Build Environment"
DESCRIPTION = "KTextWidgets provides widgets for displaying and editing text. It supports \
rich text as well as plain text. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "ktextwidgets-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "e7cf9b3ba111fbaaedb2f3b9d7fe72aa920d2447de7e46bdc52197d6be3fde547f9b3f1fba97ec1d70ac0c9765c6d5fc1c7cb19a7808d134a0843745bbd2e5e4"

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
