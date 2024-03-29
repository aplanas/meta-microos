SUMMARY = "Network transparent access to files and data"
DESCRIPTION = "This framework implements almost all the file management functions you \
will ever need. In fact, the KDE file manager (Dolphin) and the KDE \
file dialog also uses this to provide its network-enabled file management. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kio-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "8ced9317ded7fa85e4c1182eedf2e5a36efb796aaeff4ec9424dad769e7dd79a12a69ab58d0d9b6ca85b0a7563a2a1e041cfbd7f1ad4acd9d325acbef576a36c"

RPROVIDES:${PN} += "cmake-KF5KIO \
kio-devel"

RDEPENDS:${PN} += "cmake-KF5Bookmarks \
cmake-KF5Completion \
cmake-KF5Config \
cmake-KF5CoreAddons \
cmake-KF5ItemViews \
cmake-KF5JobWidgets \
cmake-KF5Service \
cmake-KF5Solid \
cmake-KF5WindowSystem \
cmake-KF5XmlGui \
cmake-Qt5Concurrent \
cmake-Qt5DBus \
cmake-Qt5Network \
extra-cmake-modules \
kio \
kio-core \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libQt5Core.so.5 \
libc.so.6"

inherit rpm
