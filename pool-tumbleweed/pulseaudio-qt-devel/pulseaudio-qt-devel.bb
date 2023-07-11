SUMMARY = "Development files for pulseaudio-qt, Qt bindings for PulseAudio"
DESCRIPTION = "Development files for pulseaudio-qt, a library providing Qt bindings to \
PulseAudio."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3"

RPM_NAME = "pulseaudio-qt-devel-1.3-1.11.aarch64.rpm"
RPM_HASH = "8eb36346280f36c2d738a56dbb023eb5d0667ab233938c374a188aac05d0d7f5ec79c73d260e7c8220db5b05fe4a72215152b5c25b89bd3d24242965a58a6129"

RPROVIDES:${PN} += "cmake-KF5PulseAudioQt \
pulseaudio-qt-devel"

RDEPENDS:${PN} += "libKF5PulseAudioQt3"

inherit rpm
