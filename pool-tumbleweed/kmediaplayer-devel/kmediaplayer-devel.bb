SUMMARY = "Interface for media player KParts: Build Environment"
DESCRIPTION = "KMediaPlayer builds on the KParts framework to provide a common interface for \
KParts that can play media files. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kmediaplayer-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "a6a5a109c1d047bf0bc7b3e8fe4bfebfe8111f846e78fd8b8272e3f153b350b608ba728e822056a881c0c3420af961076bcbe41a5888b75e9b69e300d22a5ffb"

RPROVIDES:${PN} += "cmake-KF5MediaPlayer \
kmediaplayer-devel"

RDEPENDS:${PN} += "cmake-KF5I18n \
cmake-KF5Parts \
extra-cmake-modules \
libKF5MediaPlayer5"

inherit rpm
