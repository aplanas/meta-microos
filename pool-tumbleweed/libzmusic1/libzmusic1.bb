SUMMARY = "ZDoom component library for music handling"
DESCRIPTION = "This is the music playback code from gzdoom, which was separated into its own \
code repository starting with gzdoom-4.4.0."
LICENSE = "GPL-3.0-only"

PV = "1.1.11"

RPM_NAME = "libzmusic1-1.1.11-2.3.aarch64.rpm"
RPM_HASH = "9ef07eb0fbe0ad5e235b146771a00bd712aab7ecc6025c91b999720ecab5952044418b8192d991539b0fdd0366b10e12cb1662af21c15a04bee3c6f3f664e7ee"

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
