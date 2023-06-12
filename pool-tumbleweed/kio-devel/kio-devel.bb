SUMMARY = "Network transparent access to files and data"
DESCRIPTION = "This framework implements almost all the file management functions you \
will ever need. In fact, the KDE file manager (Dolphin) and the KDE \
file dialog also uses this to provide its network-enabled file management. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kio-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "124b768ff7fa53e8550ec8f9d41b09cb55e5b939af82c9ce082185290367501dba9273a65791ab74d6f4403f1a5238855eea492e43e132770062fef48d6d096b"

RPROVIDES:${PN} += "cmake(KF5KIO) \
kio-devel \
kio-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Bookmarks) \
cmake(KF5Completion) \
cmake(KF5Config) \
cmake(KF5CoreAddons) \
cmake(KF5ItemViews) \
cmake(KF5JobWidgets) \
cmake(KF5Service) \
cmake(KF5Solid) \
cmake(KF5WindowSystem) \
cmake(KF5XmlGui) \
cmake(Qt5Concurrent) \
cmake(Qt5DBus) \
cmake(Qt5Network) \
extra-cmake-modules \
kio \
kio-core \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm