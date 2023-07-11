SUMMARY = "Utility to test X11 server performance"
DESCRIPTION = "The x11perf program runs one or more performance tests and reports how \
fast an X server can execute the tests."
LICENSE = "HPND"

PV = "1.6.2"

RPM_NAME = "x11perf-1.6.2-1.4.aarch64.rpm"
RPM_HASH = "b18348c7c31be02e409bc27a7b8c14e0d2def76859c6fae396ad6d5d83916863f00705c46c76a6b3edb51a5e6b661f1cdd5e73f3cd15e5217bb91bff8597daa8"

RPROVIDES:${PN} += "x11perf"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXmuu.so.1 \
libXrender.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
