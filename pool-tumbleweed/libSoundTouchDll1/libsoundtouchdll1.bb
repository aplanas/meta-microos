SUMMARY = "Audio Processing Library"
DESCRIPTION = "SoundTouch is a C++ audio processing library that allows \
changing the sound tempo, pitch and playback rate parameters \
independently from each other."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.2"

RPM_NAME = "libSoundTouchDll1-2.3.2-1.3.aarch64.rpm"
RPM_HASH = "2ee74917148b96bc2d4194b77e94bb942669ffb7c82687d8eb932af7d2a0260880f91c60d242f3ad0f73759a29a530d77c84bde280b1c13cb125efc273907324"

RPROVIDES:${PN} += "libSoundTouchDll.so.1 \
libSoundTouchDll1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
