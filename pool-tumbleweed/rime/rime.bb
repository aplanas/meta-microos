SUMMARY = "Rime Input Method Engine"
DESCRIPTION = "Rime is an Traditional Chinese input method engine. \
Its idea comes from ancient Chinese brush and carving art. \
Mainly it's about to express your thinking with your keystrokes."
LICENSE = "BSD-3-Clause"

PV = "1.7.3"

RPM_NAME = "rime-1.7.3-2.19.aarch64.rpm"
RPM_HASH = "deb9005c8eced5ce6ed4e299426f7a209fe9faf88e0506b0b09598c5b77374f5f5571fd9a217273757f09dd71bd733df5cf3b383a52f897f36dda3562eb2c5ef"

RPROVIDES:${PN} += "rime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libglog.so.0 \
librime.so.1 \
libstdc++.so.6"

inherit rpm
