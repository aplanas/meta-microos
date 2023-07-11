SUMMARY = "Library for Reading and Writing Quicktime Movie Files"
DESCRIPTION = "A library for reading and writing Quicktime movie files, based on and \
forked from quicktime4linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4+git20180804.fff99cd"

RPM_NAME = "libquicktime-1.2.4+git20180804.fff99cd-4.2.aarch64.rpm"
RPM_HASH = "bfade38c420c79f69ce74f19602b0a7b6515785dc1e8b858618ddbb9b2e86d4af7fa4f26570fdeee4a646bb83e1bd9af11a50d108d8c2522efea31f7f4a37be4"

RPROVIDES:${PN} += "libquicktime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.58.134 \
libc.so.6 \
libdv.so.4 \
libjpeg.so.8 \
libm.so.6 \
libmp3lame.so.0 \
libpng16.so.16 \
libquicktime.so.0 \
libschroedinger-1.0.so.0 \
libswscale.so.5.9 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
