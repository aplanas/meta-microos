SUMMARY = "Sprite position adjuster for PNG files"
DESCRIPTION = "grabpng allows to change the PNG 'GRAB' and 'ALPH' chunks used by \
ZDoom."
LICENSE = "GPL-3.0 & BSD-3-Clause"

PV = "20160630"

RPM_NAME = "grabpng-20160630-1.27.aarch64.rpm"
RPM_HASH = "a64f134fa9745b1489a039ec468b05bf52d4bc01f46c0888094639f24cf184ef03f1df0097c069f8df8c68226850a35885e6185a2767c2e97c7e72b3840a3010"

RPROVIDES:${PN} += "grabpng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
