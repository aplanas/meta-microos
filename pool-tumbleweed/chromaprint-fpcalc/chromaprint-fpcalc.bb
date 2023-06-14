SUMMARY = "Chromaprint Audio Fingerprinting Command Line Tool"
DESCRIPTION = "Chromaprint is the core component of the Acoustid project. It's a client-side \
library that implements a custom algorithm for extracting fingerprints from any \
audio source. \
This package contains fpcalc, a command-line tool to perform Chromaprint \
fingerprinting."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1"

RPM_NAME = "chromaprint-fpcalc-1.5.1-4.1.aarch64.rpm"
RPM_HASH = "87563bafe1ef4e4cefd2a12957cfe5d3957e9fa2305767d2bc5fcbedf0b00e4c8f6ba518555f2a50b3c47c1b20792a49a616e5cd6e975dde1fc26710db1456fd"

RPROVIDES:${PN} += "chromaprint-fpcalc \
fpcalc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.58.134 \
libavformat.so.58.76 \
libavutil.so.56.70 \
libc.so.6 \
libchromaprint.so.1 \
libchromaprint1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libswresample.so.3.9"

inherit rpm
