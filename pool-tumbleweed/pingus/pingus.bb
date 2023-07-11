SUMMARY = "Free Lemmings-like puzzle game"
DESCRIPTION = "Pingus is a free Lemmings-like puzzle game covered under the GNU GPL. \
It features currently 77 playable levels. \
 \
You can use to see which languages are supported \
 \
    pingus --list-languages \
 \
And start with \
 \
    pingus --language de \
 \
If you wish to play the other levels \
 \
    pingus /usr/share/pingus/levels/playable/some-level \
    pingus /usr/share/pingus/levels/incoming/some-level \
    pingus /usr/share/pingus/levels/wip/some-level \
 \
The other, probably more userfriendly, way is to simply load them into \
the level editor and then click the play button."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "pingus-0.7.6-17.2.aarch64.rpm"
RPM_HASH = "4e597afc8ab24a0b967841fbd7eb8e74d45f75cc344e0e3d9f476089b080ecf4bc2cc74de29aee4ed89bc638f857ba08b9a0cdff3ade878219a55bf3827a8e3b"

RPROVIDES:${PN} += "pingus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
