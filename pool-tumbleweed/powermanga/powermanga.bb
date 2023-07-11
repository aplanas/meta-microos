SUMMARY = "Arcade 2D shoot-them-up game"
DESCRIPTION = "In this 'shoot 'em up' with 3d graphics, you'll have to face \
and destroy more than 60 different types of opponents. \
Nice musics, many weapons, and a ton of surprises."
LICENSE = "GPL-3.0-or-later"

PV = "0.93.1"

RPM_NAME = "powermanga-0.93.1-5.4.aarch64.rpm"
RPM_HASH = "5ff8c372d5cb7f498a5870e8652f0632906818ae7d0abdc1cdcc2a5a9e396f178df0881c4f9da1e97b01acface3437b3875f59751ce615fcb5cfc460e33d7453"

RPROVIDES:${PN} += "config-powermanga \
powermanga"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libm.so.6 \
libpng16.so.16"

inherit rpm
