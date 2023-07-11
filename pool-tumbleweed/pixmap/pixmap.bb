SUMMARY = "XPM Pixel Editor for the X Window System"
DESCRIPTION = "Pixmap is a program which enables you to edit XPM-files (colour \
bitmaps). You can use them with every commonly used iconmanager and \
even incorporate them in your own desktop environment."
LICENSE = "BSD-3-Clause"

PV = "2.6"

RPM_NAME = "pixmap-2.6-152.11.aarch64.rpm"
RPM_HASH = "bbb9b1b944a9d7fdf0a854d334bf1b1e20c34ac627214a91d0d60f41e3a3bc8a659017c052a4ba926d82e92d147392f6fc9961970c757dee05c3a260e6c2a852"

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
