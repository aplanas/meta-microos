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

RPM_NAME = "pingus-0.7.6-17.1.aarch64.rpm"
RPM_HASH = "da59f77e2cea32c96c663d2c58353aeda8dcf2d41b0efc8a562d2ea76c1fa7fedb9cd718cf00a8503b004a46035066177d3010c5be4385038927738af312bb60"

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
