SUMMARY = "Text based Pacman clone"
DESCRIPTION = "MyMan is a video game for color and monochrome text \
terminals in the genre of Namco's Pac-Man. \
It includes many maze variations and several tile \
and sprite sets, ranging from large ASCII art through \
large pseudo-bitmap Unicode or CP437 graphics to \
single characters."
LICENSE = "MIT"

PV = "0.7.0+cvs20091030"

RPM_NAME = "myman-0.7.0+cvs20091030-2.18.aarch64.rpm"
RPM_HASH = "6dfd8005011c0787820725177df97dc6ffe52473815def2e7302f697b897ae37dcbad3f2bb56de891c38b40aaf0ec75634518205e876f68c145a467ca20d32ce"

RPROVIDES:${PN} += "myman \
myman(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
