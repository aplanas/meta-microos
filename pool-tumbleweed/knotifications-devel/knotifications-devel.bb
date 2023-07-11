SUMMARY = "KDE Desktop notifications: Build Environment"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "knotifications-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "bb894ef4126559d37da0c2d3a1e9eb329bcb8913c330e4481026f7b420f9ab0a821767850758c18ff9d0f9f89e6dcbecb438f9a4ee6c4ea4724d5886985a665b"

RPROVIDES:${PN} += "cmake-KF5Notifications \
knotifications-devel"

RDEPENDS:${PN} += "cmake-Qt5DBus \
cmake-Qt5TextToSpeech \
cmake-Qt5Widgets \
extra-cmake-modules \
libKF5Notifications5"

inherit rpm
