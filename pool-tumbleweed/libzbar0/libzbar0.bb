SUMMARY = "Bar code reading library"
DESCRIPTION = "ZBar reads bar codes from various sources, such as video streams, \
image files and raw intensity sensors. It supports many symbologies \
(types of bar codes) including EAN-13/UPC-A, UPC-E, EAN-8, Code 128, \
Code 39, Interleaved 2 of 5 and QR Code. \
 \
This package provides the ZBar library."
LICENSE = "LGPL-2.0-or-later"

PV = "0.23.90"

RPM_NAME = "libzbar0-0.23.90-3.1.aarch64.rpm"
RPM_HASH = "818627a84848fb1bb577d68519f16bafc3630231842e7a586a700768fdfe08b5243b7ad6baace98ab71feb6c2fc37854090c104148ea74fcc3f154bc35199469"

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
