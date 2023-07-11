SUMMARY = "Development files for libsmpeg"
DESCRIPTION = "SMPEG is a MPEG-1 video player library with sound support. Video \
playback is based on the Berkeley MPEG player, mpeg_play v2.2. Audio \
is played through a modified mpegsound library, part of Splay v0.8.2. \
SMPEG supports MPEG-1 Layer 3 audio, MPEG-1 video, and MPEG system \
streams."
LICENSE = "LGPL-2.0-only"

PV = "0.4.5"

RPM_NAME = "smpeg-devel-0.4.5-3.4.aarch64.rpm"
RPM_HASH = "63d58d43f1faf25b77d8106e791eea12bf5cb121e4c6da89a2ca6d3aa1ba4b46744ab12dd9b4ddbc64f96fb13d229b94e877f19a91c20b8578546eb8fc42a798"

RPROVIDES:${PN} += "smpeg-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libsmpeg-0-4-0"

inherit rpm
