SUMMARY = "X11 Image Loading Utility"
DESCRIPTION = "xli is a version of xloadimage. \
 \
This utility will view several types of images under X11, or load \
images onto the X11 root window."
LICENSE = "MIT"

PV = "1.17+git20170726.0bb4fb4"

RPM_NAME = "xli-1.17+git20170726.0bb4fb4-1.24.aarch64.rpm"
RPM_HASH = "2a80fea61f178dffdf9ec0d4dbb99d6d9b1b4cea186a4cbbb4d144c03ab7cdee5e3c03e185a7d433c349bcb64c2cc0b1c6b441da54d1c2faee575c98a66eff05"

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
