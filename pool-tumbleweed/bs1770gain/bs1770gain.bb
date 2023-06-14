SUMMARY = "A loudness scanner compliant with ITU-R BS.1770"
DESCRIPTION = "The command line tool bs1770gain is a loudness scanner compliant with \
ITU-R BS.1770 and its flavors EBU R128, ATSC A/85, and ReplayGain 2.0. \
It helps normalizing the loudness of audio and video files to the same \
level."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.4.1"

RPM_NAME = "bs1770gain-0.8.4.1-1.6.aarch64.rpm"
RPM_HASH = "18987d915bf08f9d3dd6810da3325c4569dfc7135bb2fcb5b62a703deed8a42ea9a0323fcb9a18ad04fbbef2e2a419d1f0394c605ad77739e38061f0ddbc35f5"

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
