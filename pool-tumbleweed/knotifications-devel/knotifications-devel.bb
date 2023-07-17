SUMMARY = "KDE Desktop notifications: Build Environment"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "knotifications-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "50fed3e04b30d20aa35826818dd37f6e61cbef8cb6761adfe1ba85406eb272e79eb2bc0b793e0a51f1f2a4b49e7f94d04397f4292b3f107619c5c20f4f762c75"

RPROVIDES:${PN} += "cmake-KF5Notifications \
knotifications-devel"

RDEPENDS:${PN} += "cmake-Qt5DBus \
cmake-Qt5TextToSpeech \
cmake-Qt5Widgets \
extra-cmake-modules \
libKF5Notifications5"

inherit rpm
