SUMMARY = "Utility program for screen recording of wlroots-based compositors"
DESCRIPTION = "Utility program for screen recording of wlroots-based compositors \
(more specifically, those that support wlr-screencopy-v1 and xdg-output)."
LICENSE = "MIT"

PV = "0.4.0+git0"

RPM_NAME = "wf-recorder-0.4.0+git0-1.1.aarch64.rpm"
RPM_HASH = "8862fa570e03dcda45ece217895cba7804de8feb9bd828dfbec768128980e018071db94eedd63446d94479afb0e22d36125a349c8d6947613b21a257c8f5ab78"

RPROVIDES:${PN} += "wf-recorder"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavdevice.so.60 \
libavfilter.so.9 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libgbm.so.1 \
libgcc-s.so.1 \
libpulse-simple.so.0 \
libpulse.so.0 \
libstdc++.so.6 \
libswresample.so.4 \
libwayland-client.so.0"

inherit rpm
