SUMMARY = "Required media files for OGRE"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the required media files for OGRE, optional files are provided \
with the ogre-demos package."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-media-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "091bfc46b147454ef29b7537666cefc76ea0ece6854980ba70d7f2da5200da615a23e6758a2a9b3466f564da02b5c0de47253020352a0011cd373506865e3a1b"

RPROVIDES:${PN} += "ogre-media"

RDEPENDS:${PN} += ""

inherit rpm
