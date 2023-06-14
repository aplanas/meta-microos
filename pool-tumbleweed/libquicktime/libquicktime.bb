SUMMARY = "Library for Reading and Writing Quicktime Movie Files"
DESCRIPTION = "A library for reading and writing Quicktime movie files, based on and \
forked from quicktime4linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4+git20180804.fff99cd"

RPM_NAME = "libquicktime-1.2.4+git20180804.fff99cd-4.1.aarch64.rpm"
RPM_HASH = "661de4ee0967a71e8d6c75bef878cc4ca4b105f39e77ed4417a32addf758117a178b151b8afb4f7bd809bb83b82072212736536c7d7a19b497c2e9208427c2a6"

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
