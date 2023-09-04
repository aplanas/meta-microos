SUMMARY = "Rime Input Method Engine"
DESCRIPTION = "Rime is an Traditional Chinese input method engine. \
Its idea comes from ancient Chinese brush and carving art. \
Mainly it's about to express your thinking with your keystrokes."
LICENSE = "BSD-3-Clause"

PV = "1.7.3"

RPM_NAME = "rime-1.7.3-2.20.aarch64.rpm"
RPM_HASH = "be8252e37042853247d3485a35fc6833fa9e321b4f36de56185d6283ff1c93f17eb495765e52565030131e1356191985c00ec88dc41594735eaa80f3191fe518"

RPROVIDES:${PN} += "rime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libglog.so.0 \
librime.so.1 \
libstdc++.so.6"

inherit rpm
