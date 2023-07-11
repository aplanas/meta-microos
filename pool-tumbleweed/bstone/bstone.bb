SUMMARY = "A source port of Blake Stone"
DESCRIPTION = "A source port of the first-person shooter Blake Stone. \
 \
Features: \
 *  High resolution rendering of world (extended vanilla engine) \
 *  Modern and vanilla controls \
 *  Allows to customize control bindings \
 *  Separate volume control of sound effects and music \
Supported games: \
 *  Aliens of Gold (v1.0/v2.0/v2.1/v3.0) full or shareware \
 *  Planet Strike (v1.0/v1.1) \
 \
 \
NOTE: To play Blake Stone with bstone you need the original game files \
You need to start the game from within the folder with these files."
LICENSE = "GPL-2.0-or-later & MIT & GPL-3.0-or-later"

PV = "1.2.12"

RPM_NAME = "bstone-1.2.12-2.2.aarch64.rpm"
RPM_HASH = "03730019085ef173a94d001ec73d329de4245ca37d3fda29d6cafdc4d7f788e909c22aa75c445810b6ed6e886df649bc3256d9d57129f9d135b279630fadcc80"

RPROVIDES:${PN} += "bstone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
