SUMMARY = "Interface for media player KParts: Build Environment"
DESCRIPTION = "KMediaPlayer builds on the KParts framework to provide a common interface for \
KParts that can play media files. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kmediaplayer-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "4856aa7ad437295c806f70ddf79f9dcb8a17803b3c3ac0986b609d7f0cafadbce949a8281f7a38244a92585d7ea647e07de1356f4e63b498fac776f03501ac57"

RPROVIDES:${PN} += "cmake(KF5MediaPlayer) \
kmediaplayer-devel \
kmediaplayer-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5I18n) \
cmake(KF5Parts) \
extra-cmake-modules \
libKF5MediaPlayer5"

inherit rpm
