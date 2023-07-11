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

RPM_NAME = "mda-lv2-1.2.6-1.7.aarch64.rpm"
RPM_HASH = "8a50c43a2cca03366efe707e6a0fddca4bc81d439d5f6e65c1bb863d89617901136457f7afc4e652897988453e227c9a60b6fd83e1c872a539a9fc28ddcd641b"

RPROVIDES:${PN} += "mda-lv2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
