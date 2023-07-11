SUMMARY = "Pixel manipulation library"
DESCRIPTION = "Pixman is a pixel manipulation library for X and cairo."
LICENSE = "MIT"

PV = "0.42.2"

RPM_NAME = "libpixman-1-0-0.42.2-1.4.aarch64.rpm"
RPM_HASH = "7fa37760a2f55078d78291dacfbcaec1c2eb5455dcfcdc33e9c1fa6f2c0880cc3217fd2559b65128d17cdff47a3d3a3f3bb00ab53770701ecb541e98d5e2513c"

RPROVIDES:${PN} += "libpixman-1-0 \
libpixman-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
