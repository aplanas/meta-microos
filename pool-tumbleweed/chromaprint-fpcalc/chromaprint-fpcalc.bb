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
chromaprint-fpcalc(aarch-64) \
fpcalc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavformat.so.58.76()(64bit) \
libavformat.so.58.76(LIBAVFORMAT_58)(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libchromaprint.so.1()(64bit) \
libchromaprint1 \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libswresample.so.3.9()(64bit) \
libswresample.so.3.9(LIBSWRESAMPLE_3)(64bit)"

inherit rpm
