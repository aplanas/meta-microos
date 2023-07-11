SUMMARY = "Network transparent access to files and data"
DESCRIPTION = "This framework implements almost all the file management functions you \
will ever need. In fact, the KDE file manager (Dolphin) and the KDE \
file dialog also uses this to provide its network-enabled file management. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kio-devel-5.107.0-2.1.aarch64.rpm"
RPM_HASH = "17cf1dbe822ea7faa239da4d6be50b8fa691786a09655e9cc34d833f512c953e1c3987ee3eea1e0a22aac1bf22b1d223a8d778ae40d88e8de3495112b771a692"

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
