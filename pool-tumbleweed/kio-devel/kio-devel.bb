SUMMARY = "Network transparent access to files and data"
DESCRIPTION = "This framework implements almost all the file management functions you \
will ever need. In fact, the KDE file manager (Dolphin) and the KDE \
file dialog also uses this to provide its network-enabled file management. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kio-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "0f0e7b37a2dc8571a3b8bbfc9176813cfaa266a92cc8b290af3be9755b98b433e7cdf4231817ce25b7e851ad83069c9e35a78c6a36f1c359ed8bbc1a5a83d279"

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
