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

RPM_NAME = "libOgreOverlay13_5-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "198589c817b010ba8791eb92b3c3e8a7536b1b31f6498b6b38b31ec1e112295852f685c385fcba87ce9d0a39bb768e154adf23630394c1e287af76e5cac98abf"

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
