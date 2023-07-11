SUMMARY = "Text based Pacman clone"
DESCRIPTION = "MyMan is a video game for color and monochrome text \
terminals in the genre of Namco's Pac-Man. \
It includes many maze variations and several tile \
and sprite sets, ranging from large ASCII art through \
large pseudo-bitmap Unicode or CP437 graphics to \
single characters."
LICENSE = "MIT"

PV = "0.7.0+cvs20091030"

RPM_NAME = "myman-0.7.0+cvs20091030-2.19.aarch64.rpm"
RPM_HASH = "8b1765535debde03570b5a827d9420e4eeae2aa36cb472a886f8593b5f03fa356e211632281e901e9ec386e856594eb729c1fd9297b5b05ca548c711c4d938c0"

RPROVIDES:${PN} += "myman"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
