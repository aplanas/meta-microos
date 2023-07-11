SUMMARY = "Camsource Grabs Images from a Video4Linux Device"
DESCRIPTION = "Camsource grabs images from a video4linux device (webcam or TV card). \
It is modular and has several plug-ins for modifying the image before \
displaying it via HTTP or FTP upload."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "camsource-devel-0.7.1-3.14.aarch64.rpm"
RPM_HASH = "1f6373f9e8210a4865b310d57857dbea3c6359a6eb354582c2134f2097b189058c5c6ca5ef9ce4bb252337f7394bb48440f3bef67256a7ebfa7e43ca761bc6c2"

RPROVIDES:${PN} += "camsource-/usr/include/camsource/image.h \
camsource-devel"

RDEPENDS:${PN} += "camsource"

inherit rpm
