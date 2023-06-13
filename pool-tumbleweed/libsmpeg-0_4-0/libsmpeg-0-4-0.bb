SUMMARY = "SDL MPEG Player Library"
DESCRIPTION = "SMPEG is a MPEG-1 video player library with sound support. Video \
playback is based on the Berkeley MPEG player, mpeg_play v2.2. Audio \
is played through a modified mpegsound library, part of Splay v0.8.2. \
SMPEG supports MPEG-1 Layer 3 audio, MPEG-1 video, and MPEG system \
streams."
LICENSE = "LGPL-2.0-only"

PV = "0.4.5"

RPM_NAME = "libsmpeg-0_4-0-0.4.5-3.3.aarch64.rpm"
RPM_HASH = "f3f350f76dc56f9a7eb4abc5518bb4c7a14113938c09cdcc534852df702bd724ecfa409fb283a0f08cca4e45e4ddf7cc71fc7524bae53d036c6b9a299bde5887"

RPROVIDES:${PN} += "libsmpeg-0.4.so.0()(64bit) \
libsmpeg-0_4-0 \
libsmpeg-0_4-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL-1.2.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
