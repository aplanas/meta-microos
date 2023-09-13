SUMMARY = "Required media files for OGRE"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the required media files for OGRE, optional files are provided \
with the ogre-demos package."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-media-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "51474640f534fc5f8ea6a5872d0bdb8de0065625426d7f7cc16c6ed93ceb9f67924f455920b40300227177576e9cda134d0e70bd55fe23afb17defa4a4a6f98b"

RPROVIDES:${PN} += "ogre-media"

RDEPENDS:${PN} += ""

inherit rpm
