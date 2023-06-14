SUMMARY = "XPM Pixel Editor for the X Window System"
DESCRIPTION = "Pixmap is a program which enables you to edit XPM-files (colour \
bitmaps). You can use them with every commonly used iconmanager and \
even incorporate them in your own desktop environment."
LICENSE = "BSD-3-Clause"

PV = "2.6"

RPM_NAME = "pixmap-2.6-152.10.aarch64.rpm"
RPM_HASH = "9ed061cff6b1f339d9d1a710c05b8fa54ed63cc4599a2b2384f44771e2f1d275aa9e42a2ea0113794da9dd22d7b580642e60f5cc285f0289395f3fcda5afc8b0"

RPROVIDES:${PN} += "config-pixmap \
pixmap \
pixmap26 \
pixmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXext.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
