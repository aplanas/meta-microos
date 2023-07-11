SUMMARY = "A loudness scanner compliant with ITU-R BS.1770"
DESCRIPTION = "The command line tool bs1770gain is a loudness scanner compliant with \
ITU-R BS.1770 and its flavors EBU R128, ATSC A/85, and ReplayGain 2.0. \
It helps normalizing the loudness of audio and video files to the same \
level."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.4.1"

RPM_NAME = "bs1770gain-0.8.4.1-1.7.aarch64.rpm"
RPM_HASH = "05f3ec175b4843d23df6539aee1c8037fe4dc8020dd438763fc9bfd99ce9c2a62673b920767842b1a58cb46b092a9349020ed2e2e907656ceb2c3f0edc541c4b"

RPROVIDES:${PN} += "bs1770gain"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavfilter.so.9 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libm.so.6 \
libpostproc.so.57 \
libswresample.so.4 \
libswscale.so.7"

inherit rpm
