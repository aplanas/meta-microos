SUMMARY = "LV2 port of MDA plugins"
DESCRIPTION = "MDA-LV2 is an LV2 port of the MDA plugins by Paul Kellett. It \
contains 36 high-quality plugins for a variety of tasks. \
 \
The instrument plugins make use of the new atom:AtomPort to receive \
MIDI. Apologies for any inconvenience, but this means they will \
only work in modern hosts which have implemented atom-based MIDI. \
The effects should work fine in any LV2 host."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.6"

RPM_NAME = "mda-lv2-1.2.6-1.6.aarch64.rpm"
RPM_HASH = "3305f37fb0cb8e73436f4045f5c9e7346620347ff1ba5a31052525dc416cde5c488ac9da55061bd241f061cc97f2a04f6c19cd4413d565cac9563f3992243552"

RPROVIDES:${PN} += "mda-lv2 \
mda-lv2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
