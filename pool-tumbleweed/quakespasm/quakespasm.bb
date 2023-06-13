SUMMARY = "A Quake Engine"
DESCRIPTION = "QuakeSpasm is a Quake 1 engine based on the SDL2 port of FitzQuake.  It includes \
64-bit CPU support, a new sound driver, several networking fixes and a few \
graphical niceities, while also staying true to the original game. \
Game data must be placed in ~/.quakespasm/id1 ."
LICENSE = "GPL-2.0-or-later"

PV = "0.95.1"

RPM_NAME = "quakespasm-0.95.1-1.3.aarch64.rpm"
RPM_HASH = "224a2f06c3a86132b07718ba005b15def6cb10df84ba3f4f8da07e3403a044a205847b7aafd28642e34a4ec129114cfc578e688382507ec6664bf54a189cc189"

RPROVIDES:${PN} += "application() \
application(quakespasm.desktop) \
metainfo() \
metainfo(quakespasm.appdata.xml) \
quakespasm \
quakespasm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libvorbisfile.so.3()(64bit)"

inherit rpm
