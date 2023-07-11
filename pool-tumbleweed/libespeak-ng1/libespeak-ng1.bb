SUMMARY = "Software speech synthesizer (text-to-speech)"
DESCRIPTION = "Software speech synthesizer (text-to-speech), support \
library."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.51"

RPM_NAME = "libespeak-ng1-1.51-1.9.aarch64.rpm"
RPM_HASH = "506272a7a876bda7ef7ee2cbe39fe81c4c4980e6d5bd2f3b9058a0c33db03843f5b313b1a937a835477e72348c6e4d63829b06fb5329b2bcb50a9d5b78a2a07e"

RPROVIDES:${PN} += "libespeak-ng.so.1 \
libespeak-ng1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcaudio.so.0 \
libstdc++.so.6"

inherit rpm
