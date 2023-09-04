SUMMARY = "Interface for media player KParts: Build Environment"
DESCRIPTION = "KMediaPlayer builds on the KParts framework to provide a common interface for \
KParts that can play media files. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kmediaplayer-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "2f9dd6e321abea4a00599c65c6700940035630f51c0c844e078935b90a2cc0fa4fcf72be9569e16b076bef6cba8e5938a2c0c8d0209f1f43725b0f63ee080127"

RPROVIDES:${PN} += "cmake-KF5MediaPlayer \
kmediaplayer-devel"

RDEPENDS:${PN} += "cmake-KF5I18n \
cmake-KF5Parts \
extra-cmake-modules \
libKF5MediaPlayer5"

inherit rpm
