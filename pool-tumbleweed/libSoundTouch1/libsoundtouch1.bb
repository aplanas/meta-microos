SUMMARY = "Audio Processing Library"
DESCRIPTION = "SoundTouch is a C++ audio processing library that allows \
changing the sound tempo, pitch and playback rate parameters \
independently from each other."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.2"

RPM_NAME = "libSoundTouch1-2.3.2-1.3.aarch64.rpm"
RPM_HASH = "d1385396d159fe0526f9e5f008696c6c4baee24a3eb2811098e0df658186526699fbd366c396a80ee6ccd8404a49d4a3737a9b08e7716cb4e103e5340c9f15be"

RPROVIDES:${PN} += "libSoundTouch.so.1 \
libSoundTouch1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
