SUMMARY = "Chromaprint Audio Fingerprinting Command Line Tool"
DESCRIPTION = "Chromaprint is the core component of the Acoustid project. It's a client-side \
library that implements a custom algorithm for extracting fingerprints from any \
audio source. \
This package contains fpcalc, a command-line tool to perform Chromaprint \
fingerprinting."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1"

RPM_NAME = "chromaprint-fpcalc-1.5.1-4.2.aarch64.rpm"
RPM_HASH = "13e07fdb7ffed5c9ee05340522ce87469a4e26c5d310bdd9e3dace1e157cc50238bf4b0e9daa1a0cbd1dab37b6b59dd100524bf607314b3bbbe42dd9f853c678"

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
