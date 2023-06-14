SUMMARY = "Development files for the SoundTouch audio processing library"
DESCRIPTION = "SoundTouch is a C++ audio processing library that allows \
changing the sound tempo, pitch and playback rate parameters \
independently from each other. \
 \
This subpackage contains the header files for building programs with \
SoundTouch."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.2"

RPM_NAME = "soundtouch-devel-2.3.2-1.2.aarch64.rpm"
RPM_HASH = "801cf2e99cd2e4e710a0d0ef2edba0f6134efc299d188008a183558e35a13fa3356871817cc6ff03ad0edb70228c3505b72b3f04b51507226867991a11eaa052"

RPROVIDES:${PN} += "pkgconfig-soundtouch \
soundtouch-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libSoundTouch1"

inherit rpm
