SUMMARY = "Tool to Extract Game Archives"
DESCRIPTION = "unmass is a tool to extract game archives. \
 \
It supports the following archive types: Crimson Land, Baldur's Gate 2, \
Civilization 4, Doom (WADs), Dune 2, Etherlords 2, Final Fantasy 7 and 8, \
Flashpoint, Knights of Xentar, Metal Gear Solid (DARs), Moorhuhn 2 and 3, \
Megaman Legends, Oni, Operation Flashpoint, Princess Maker 2, Quake 1, \
RollCage, Swine, Unreal Tournament umods, Virtua Fighter bitmaps, MEA exe's, \
and some economy file formats."
LICENSE = "GPL-2.0-only"

PV = "0.92"

RPM_NAME = "unmass-0.92-3.14.aarch64.rpm"
RPM_HASH = "a086774703fbe03fa2cff45be8a8fbf0f075c52c30b35d0cc4d4af712bf4454092ccfb2d8083a35dd967345e3074e95c9d7470f5cddcab2af898f30a55e7442c"

RPROVIDES:${PN} += "unmass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
