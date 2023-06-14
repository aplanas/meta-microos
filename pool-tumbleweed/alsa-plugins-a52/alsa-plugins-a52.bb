SUMMARY = "A52 Output Plug-In for ALSA Library"
DESCRIPTION = "This package contains the A52 (aka AC3) output plug-in for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-a52-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "7a1847178a81e62c991f3925f1d6b2d0b78779845e57580901d870e754531fe0fc68b699252618eb5b69b93701de941c4518cd196025921b5b069657d461af16"

RPROVIDES:${PN} += "alsa-plugins-a52 \
libasound-module-pcm-a52.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libavcodec.so.60 \
libavutil.so.58 \
libc.so.6"

inherit rpm
