SUMMARY = "Utility program for screen recording of wlroots-based compositors"
DESCRIPTION = "Utility program for screen recording of wlroots-based compositors \
(more specifically, those that support wlr-screencopy-v1 and xdg-output)."
LICENSE = "MIT"

PV = "0.3.0+git19"

RPM_NAME = "wf-recorder-0.3.0+git19-1.6.aarch64.rpm"
RPM_HASH = "597cf8b531ad4a1a6f5c30cf54ac62c4a589009844961a81dd34fbbfb0868fb0aaeea47c523b5a09e3f0ecd4d0d4b63d35b30a5918fba8718707ab9b91598dd4"

RPROVIDES:${PN} += "wf-recorder"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavdevice.so.60 \
libavfilter.so.9 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libgcc-s.so.1 \
libpulse-simple.so.0 \
libpulse.so.0 \
libstdc++.so.6 \
libswresample.so.4 \
libwayland-client.so.0"

inherit rpm
