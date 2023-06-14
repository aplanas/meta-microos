SUMMARY = "Audio Fingerprinting Library"
DESCRIPTION = "Chromaprint is the core component of the Acoustid project. It's a client-side \
library that implements a custom algorithm for extracting fingerprints from any \
audio source."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.1"

RPM_NAME = "libchromaprint1-1.5.1-4.1.aarch64.rpm"
RPM_HASH = "d7a5dd1d198ce9e5753467a47be6816278e8b975b6dfc6826c027467fa0d7c0625ef6985d9906170e376b73fb397e86dee5803f6cb717d21478db761d1554e28"

RPROVIDES:${PN} += "libchromaprint.so.1 \
libchromaprint1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.58.134 \
libavutil.so.56.70 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
