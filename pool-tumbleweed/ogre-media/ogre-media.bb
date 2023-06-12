SUMMARY = "Required media files for OGRE"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the required media files for OGRE, optional files are provided \
with the ogre-demos package."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-media-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "cedb3882bf1055ee33ba197ce794a6fa312d9cfd86d8df5c949a7c1a707e6ae83be22ae00e512b6a0d23286116b3f9582805bb1998170d4b6430b7615e0431e0"

RPROVIDES:${PN} += "ogre-media \
ogre-media(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
