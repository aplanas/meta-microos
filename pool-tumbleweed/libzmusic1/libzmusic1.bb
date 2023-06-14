SUMMARY = "ZDoom component library for music handling"
DESCRIPTION = "This is the music playback code from gzdoom, which was separated into its own \
code repository starting with gzdoom-4.4.0."
LICENSE = "GPL-3.0-only"

PV = "1.1.11"

RPM_NAME = "libzmusic1-1.1.11-2.2.aarch64.rpm"
RPM_HASH = "e999fbb25ef7d8a37da96c723e92391633316090142c325353bd546ab0e189351ac348db52caf4312921274fa16d78b961c05ac204783ae56610cd6b9ef9d2d8"

RPROVIDES:${PN} += "libzmusic.so.1 \
libzmusic1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libgme.so.0 \
libm.so.6 \
libmpg123.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
