SUMMARY = "Development files for libsmpeg"
DESCRIPTION = "SMPEG is a MPEG-1 video player library with sound support. Video \
playback is based on the Berkeley MPEG player, mpeg_play v2.2. Audio \
is played through a modified mpegsound library, part of Splay v0.8.2. \
SMPEG supports MPEG-1 Layer 3 audio, MPEG-1 video, and MPEG system \
streams."
LICENSE = "LGPL-2.0-only"

PV = "0.4.5"

RPM_NAME = "smpeg-devel-0.4.5-3.3.aarch64.rpm"
RPM_HASH = "e12be289eebc851347b570f24ed1a44f24f5bc654e04aa6582058f31e645ff34500c4377c19d383b9ea1cb17cedf92e6774679c6fd88b2030e1a31d46acffe65"

RPROVIDES:${PN} += "smpeg-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libsmpeg-0-4-0"

inherit rpm
