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

RPM_NAME = "zbar-0.23.90-3.1.aarch64.rpm"
RPM_HASH = "e309b8d9c858fe69c09a6b91295057b4844aa3e28809f7e035d068b4da316afd680aa4750f2afceb9f4b2ecd1c8755b9de2a42e61abee084a4a3d5d02d071165"

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
