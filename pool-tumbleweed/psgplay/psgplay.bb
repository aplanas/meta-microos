SUMMARY = "Player for Atari ST Music Files"
DESCRIPTION = "This package allows you to play music from Atari ST games and demos on \
your PC. \
 \
You can find a comprehensive archive on the World Wide Web at \
http://www.nocrew.org/software/psgplay/tunes/"
LICENSE = "GPL-2.0+"

PV = "0.6"

RPM_NAME = "psgplay-0.6-861.27.aarch64.rpm"
RPM_HASH = "4381ef2a206288d68878f71fa13b178e6825359c3e40e9ee6aac7e11dafbf57d4198e2bd4feda100de5c9d6694317cb88ca965835ba5e734acdc9d16c661bcb9"

RPROVIDES:${PN} += "psgplay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
