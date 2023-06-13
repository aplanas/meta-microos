SUMMARY = "A wrapper for OpenCV's CvCapture_FFMPEG and CvVideoWriter_FFMPEG"
DESCRIPTION = "A wrapper for OpenCV's CvCapture_FFMPEG and CvVideoWriter_FFMPEG. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.2"

RPM_NAME = "octave-forge-video-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "7757dbdafd9693b72458beedbefe17c036f5b0da7a2079d92b4cf9b7e40d6de5622a91280decdafa926089fecba54a8ab4071d5df5b440f75146c2e3564cdbbf"

RPROVIDES:${PN} += "octave-forge-video \
octave-forge-video(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavformat.so.58.76()(64bit) \
libavformat.so.58.76(LIBAVFORMAT_58)(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libswscale.so.5.9()(64bit) \
libswscale.so.5.9(LIBSWSCALE_5)(64bit) \
octave-cli"

inherit rpm
