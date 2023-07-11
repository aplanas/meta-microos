SUMMARY = "S3 Savage video driver for the Xorg X server"
DESCRIPTION = "savage is an Xorg driver for S3 Savage video cards. \
 \
2D, 3D, and Xv acceleration is supported on all chips except the \
Savage2000 (2D only). Dualhead operation is supported on MX, IX, and \
SuperSavage chips."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "xf86-video-savage-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "a52ddedc4e4a147b2b9aca1f53e92727f1a06dffeaa61b3e445d713b2dcab1d0718a421bb98b3470ac19d58f70d3d6685dd7b4c2668c3183700e96411aff880f"

RPROVIDES:${PN} += "xf86-video-savage"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
