SUMMARY = "A modern reimplementation of the game Duke Nukem II"
DESCRIPTION = "A modern reimplementation of the game Duke Nukem II, originally released in \
1993 for MS-DOS by Apogee Software. \
 \
You need the original game's data files in order to play, e.g. the freely \
available shareware version."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "RigelEngine-0.9.1-2.1.aarch64.rpm"
RPM_HASH = "5801b730a75c7c61e52985b228361fc97ffbee68e023becbbb14e0e5dc9e9b67f3e1cc0e58beaad19960376b58bb101c838760e35ee4683a11f7e5064df18579"

RPROVIDES:${PN} += "RigelEngine \
RigelEngine(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
