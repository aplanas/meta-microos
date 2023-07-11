SUMMARY = "SDL MPEG Player Library"
DESCRIPTION = "SMPEG is a MPEG-1 video player library with sound support. Video \
playback is based on the Berkeley MPEG player, mpeg_play v2.2. Audio \
is played through a modified mpegsound library, part of Splay v0.8.2. \
SMPEG supports MPEG-1 Layer 3 audio, MPEG-1 video, and MPEG system \
streams."
LICENSE = "LGPL-2.0-only"

PV = "0.4.5"

RPM_NAME = "libsmpeg-0_4-0-0.4.5-3.4.aarch64.rpm"
RPM_HASH = "1f3a26f41747af989410ff420b8aeac381165b0cbca8265531abb65f1d3d44be46d929cbc3212e2cbe5078b0ecae137cc14ba82dd45b0d15281b706b4db01883"

RPROVIDES:${PN} += "libsmpeg-0-4-0 \
libsmpeg-0.4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
