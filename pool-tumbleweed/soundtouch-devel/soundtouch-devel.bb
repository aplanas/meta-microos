SUMMARY = "Development files for the SoundTouch audio processing library"
DESCRIPTION = "SoundTouch is a C++ audio processing library that allows \
changing the sound tempo, pitch and playback rate parameters \
independently from each other. \
 \
This subpackage contains the header files for building programs with \
SoundTouch."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.2"

RPM_NAME = "soundtouch-devel-2.3.2-1.3.aarch64.rpm"
RPM_HASH = "9ea1da83ad169a8b91d9a556ca798880cba028ed4e7895661e11e0bfc27af53c178c8d16f0fff2d0732122fe9b9605ab8050ed46b8a3123af75275a6f76ceb0f"

RPROVIDES:${PN} += "pkgconfig-soundtouch \
soundtouch-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libSoundTouch1"

inherit rpm
