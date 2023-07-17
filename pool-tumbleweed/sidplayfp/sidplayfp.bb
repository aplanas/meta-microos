SUMMARY = "SID chip music module player"
DESCRIPTION = "A player for playing SID music modules originally created on the Commodore 64 \
and compatibles."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.0"

RPM_NAME = "sidplayfp-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "8ec9a749d63dc7b44cb353898a9a9b2413b00909649d5e92964e31114868de868708c01ef0ecf61476f39084fd90b3c4e7a8a14e268fb6ec3f59b808dbbfb84f"

RPROVIDES:${PN} += "sidplayfp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsidplayfp.so.6 \
libstdc++.so.6 \
libstilview.so.0"

inherit rpm
