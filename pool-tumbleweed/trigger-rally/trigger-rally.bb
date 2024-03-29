SUMMARY = "Fast-paced single-player rally racing game"
DESCRIPTION = "A 3D rally simulation with a physics engine for drifting, over 100 maps, \
different terrain materials like dirt, asphalt, sand, ice etc. and various \
weather, light and fog conditions. Most maps are equipped with spoken co-driver \
notes and co-driver icons."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.6.1"

RPM_NAME = "trigger-rally-0.6.6.1-3.9.aarch64.rpm"
RPM_HASH = "d417864f0da426c92e762c54915e85b940bc2327a8f909d213aad577352207b814acfd3a763ad25c4cb9c8806224efe7c2d61fb4a2b2f13de7e548eafc3316f5"

RPROVIDES:${PN} += "trigger-rally"

RDEPENDS:${PN} += "libGL.so.1 \
libGLEW.so.2.2 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libalut.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libphysfs.so.1 \
libstdc++.so.6 \
libtinyxml2.so.9 \
trigger-rally-data"

inherit rpm
