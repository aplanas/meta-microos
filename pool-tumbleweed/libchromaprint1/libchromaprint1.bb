SUMMARY = "Audio Fingerprinting Library"
DESCRIPTION = "Chromaprint is the core component of the Acoustid project. It's a client-side \
library that implements a custom algorithm for extracting fingerprints from any \
audio source."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.1"

RPM_NAME = "libchromaprint1-1.5.1-4.2.aarch64.rpm"
RPM_HASH = "eac02b665e34c000b161c0b805322fa8256c4e32c13517ea008b48f65dc4fc73b978e125608975f90737dcf4d700d1b821cc2af4eafc218d8a85729b5443b6cb"

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
