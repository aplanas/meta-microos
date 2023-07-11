SUMMARY = "A wrapper for OpenCV's CvCapture_FFMPEG and CvVideoWriter_FFMPEG"
DESCRIPTION = "A wrapper for OpenCV's CvCapture_FFMPEG and CvVideoWriter_FFMPEG. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.2"

RPM_NAME = "octave-forge-video-2.0.2-1.2.aarch64.rpm"
RPM_HASH = "a8e14497ac3dd97a3f002e2fbc313538a56461bca1c0d134843794b79bc26f59f94be33a6e2e3d720c09604a5187c6108ad54a2a702fe897c0025a0c76310b05"

RPROVIDES:${PN} += "octave-forge-video"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavcodec.so.58.134 \
libavformat.so.58.76 \
libavutil.so.56.70 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libswscale.so.5.9 \
octave-cli"

inherit rpm
