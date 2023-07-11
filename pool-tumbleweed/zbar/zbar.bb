SUMMARY = "Bar code reader"
DESCRIPTION = "ZBar reads bar codes from various sources, such as video streams, \
image files and raw intensity sensors. It supports many symbologies \
(types of bar codes) including EAN-13/UPC-A, UPC-E, EAN-8, Code 128, \
Code 39, Interleaved 2 of 5 and QR Code. \
 \
It can be used through the standalone GUI and command-line programs, \
or integrated by other programs through a library."
LICENSE = "LGPL-2.0-or-later"

PV = "0.23.90"

RPM_NAME = "zbar-0.23.90-4.1.aarch64.rpm"
RPM_HASH = "e314eadd9c540f76de76db23b7e7f6c8499bb32114e2a872d837a37d76cd714842d98e578e62de229ef2b99930e80f19d45e83825085a91d0f481e09396d35a9"

RPROVIDES:${PN} += "zbar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagickWand-7.Q16HDRI.so.10 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzbar.so.0 \
libzbarqt.so.0"

inherit rpm
