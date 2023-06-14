SUMMARY = "X11 Image Loading Utility"
DESCRIPTION = "xli is a version of xloadimage. \
 \
This utility will view several types of images under X11, or load \
images onto the X11 root window."
LICENSE = "MIT"

PV = "1.17+git20170726.0bb4fb4"

RPM_NAME = "xli-1.17+git20170726.0bb4fb4-1.23.aarch64.rpm"
RPM_HASH = "ab827e596ccf1760a0a36112dcf9582b13082b9e702c1da566b1f88c212d599fbc944b0c63ed4166557adff67a5753170f3828f85891ae473bd47e610defed57"

RPROVIDES:${PN} += "xli \
xli115 \
xloadimage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16"

inherit rpm
