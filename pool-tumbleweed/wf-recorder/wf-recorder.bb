SUMMARY = "Utility program for screen recording of wlroots-based compositors"
DESCRIPTION = "Utility program for screen recording of wlroots-based compositors \
(more specifically, those that support wlr-screencopy-v1 and xdg-output)."
LICENSE = "MIT"

PV = "0.3.0+git19"

RPM_NAME = "wf-recorder-0.3.0+git19-1.5.aarch64.rpm"
RPM_HASH = "4a394ae8b80842ac42d2f23d3a4350b1ee85c720cca83bf126100eeefc3b067e1557d1a5c68c72602206525bb3e2f63db1f69b3e53edba062102cbad5409aa21"

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
