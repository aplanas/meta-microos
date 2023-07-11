SUMMARY = "Interface for media player KParts: Build Environment"
DESCRIPTION = "KMediaPlayer builds on the KParts framework to provide a common interface for \
KParts that can play media files. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kmediaplayer-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "23815688410b6b34127a03288bd36f0f15c6c1195d13b6e8b297182eca7d720e08b82538e15efc4f6c9627d11d855f1ac3b3867894800e0929653b5ead087170"

RPROVIDES:${PN} += "cmake-KF5MediaPlayer \
kmediaplayer-devel"

RDEPENDS:${PN} += "cmake-KF5I18n \
cmake-KF5Parts \
extra-cmake-modules \
libKF5MediaPlayer5"

inherit rpm
