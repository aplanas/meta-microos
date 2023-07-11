SUMMARY = "Bar code reading library"
DESCRIPTION = "ZBar reads bar codes from various sources, such as video streams, \
image files and raw intensity sensors. It supports many symbologies \
(types of bar codes) including EAN-13/UPC-A, UPC-E, EAN-8, Code 128, \
Code 39, Interleaved 2 of 5 and QR Code. \
 \
This package provides the ZBar library."
LICENSE = "LGPL-2.0-or-later"

PV = "0.23.90"

RPM_NAME = "libzbar0-0.23.90-4.1.aarch64.rpm"
RPM_HASH = "548080b7e211cec7897328a1e381de39a26245e0a709f27495ce42fda68e198ff874096591a0cef033c60d9ba9a7a8e0d878b622db67a8e0b155aa0a856d2961"

RPROVIDES:${PN} += "libzbar.so.0 \
libzbar0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXv.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libjpeg.so.8 \
libv4l2.so.0"

inherit rpm
