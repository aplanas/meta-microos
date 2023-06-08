SUMMARY = "Camsource Grabs Images from a Video4Linux Device"
DESCRIPTION = "Camsource grabs images from a video4linux device (webcam or TV card). \
It is modular and has several plug-ins for modifying the image before \
displaying it via HTTP or FTP upload."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "camsource-devel-0.7.1-3.13.aarch64.rpm"
RPM_HASH = "af0905472a12e1d2810563138338140130072f5f672ecfc78d0099d6ccda69fd618a0c36cec68258385ec55f707f5ca53ff5b43abf025721810971c6ea8bc251"

RPROVIDES:${PN} += "camsource-devel camsource-devel(aarch-64) camsource:/usr/include/camsource/image.h"
RDEPENDS:${PN} += "camsource"

inherit rpm
