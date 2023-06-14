SUMMARY = "A racing game in the style of 'Stunts'"
DESCRIPTION = "Ultimate Stunts is a remake of the famous DOS game 'Stunts'. Racing in \
Ultimate Stunts involves some really spectacular stunts, like \
loopings, corkscrews, bridges to jump over, etc. You can also design \
your own tracks."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.7.1"

RPM_NAME = "ultimatestunts-0.7.7.1-2.3.aarch64.rpm"
RPM_HASH = "020e6ed99b2d28d6f8f45457f284df9f4bb6534e560e1494d811716b88092aa3a73647056fe3fb8d046f8eb87ad43516b9abe61f25a3742ac82f449912574d1f"

RPROVIDES:${PN} += "config-ultimatestunts \
ultimatestunts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libalut.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6 \
libvorbisfile.so.3 \
ultimatestunts-data"

inherit rpm
