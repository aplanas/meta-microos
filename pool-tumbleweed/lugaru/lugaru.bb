SUMMARY = "Third-person ninja rabbit fighting game"
DESCRIPTION = "Lugaru is the predecessor to Overgrowth (http://www.wolfire.com/overgrowth). \
It is a third-person action game. The main character, Turner, is an anthropomorphic \
rebel bunny rabbit with impressive combat skills. In his quest to find those responsible \
for slaughtering his village, he uncovers a far-reaching conspiracy involving the corrupt \
leaders of the rabbit republic and the starving wolves from a nearby den. Turner takes it \
upon himself to fight against their plot and save his fellow rabbits from slavery."
LICENSE = "GPL-2.0+"

PV = "1.2"

RPM_NAME = "lugaru-1.2-2.22.aarch64.rpm"
RPM_HASH = "267bfb5cd5750ce50fc3de565f5521174d83907ceb0bb313d629f3dd1223802452cb11696f681a035facb0a7f0707c1c8a99ed0ff830270c83d221c9b66ccc78"

RPROVIDES:${PN} += "application() \
application(lugaru.desktop) \
lugaru \
lugaru(aarch-64) \
metainfo() \
metainfo(lugaru.appdata.xml)"

RDEPENDS:${PN} += "/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libopenal.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libvorbisfile.so.3()(64bit) \
lugaru-data"

inherit rpm
