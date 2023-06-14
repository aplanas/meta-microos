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

RPM_NAME = "libOgreOverlay13_5-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "5df9f8dc94eb3d92006ed340de98893cd9d8c8023ed6935a7493f84bbd18a65984fcac9bcc5a9b557a05f507e56e3c2d88651a5fd0977fe14a493cbcd000b4ec"

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
