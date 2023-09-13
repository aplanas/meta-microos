SUMMARY = "Ogre Overlay library"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
An overlay is an additional plane that is layed over the finished render of a \
scene. Commonly, scores or interaction menus for the player are positioned \
there. In the Ogre demos, overlays are used to display the Ogre logo as well as \
current information about the scene, such as polygon count or current frames \
per second."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreOverlay13_5-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "bda1d0f5ae08c21b57678360a473289965a9dcdf5a3966c39f201ee3d29197535c77d4a399ef0c2f04b90b248b7d25f47964876bbaab6a5e5de99ff8e0b3cc30"

RPROVIDES:${PN} += "libOgreOverlay.so.13.5 \
libOgreOverlay13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.5 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
