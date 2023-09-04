SUMMARY = "KDE Desktop notifications: Build Environment"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "knotifications-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "48a51cfe2df568f9e3175b36e2232958e191e728e731f9082828a21b2793399bfab9fde997c143d3cb7ef780e7543bdc939efcb92ee501671ac9d5196230e383"

RPROVIDES:${PN} += "cmake-KF5Notifications \
knotifications-devel"

RDEPENDS:${PN} += "cmake-Qt5DBus \
cmake-Qt5TextToSpeech \
cmake-Qt5Widgets \
extra-cmake-modules \
libKF5Notifications5"

inherit rpm
