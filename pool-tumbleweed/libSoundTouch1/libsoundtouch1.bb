SUMMARY = "Audio Processing Library"
DESCRIPTION = "SoundTouch is a C++ audio processing library that allows \
changing the sound tempo, pitch and playback rate parameters \
independently from each other."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.2"

RPM_NAME = "libSoundTouch1-2.3.2-1.2.aarch64.rpm"
RPM_HASH = "985b8fd0b7abe1ce7ccc5eac4f7a932f505cb8da717b39b4db293d91f99e5ebebe970080bf509a305e914bd93e1b6b7e5b66dee52e1048b7d69f265ab555ab28"

RPROVIDES:${PN} += "libSoundTouch.so.1 \
libSoundTouch1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
