SUMMARY = "Primitive command line interface to RandR extension"
DESCRIPTION = "Xrandr is used to set the size, orientation and/or reflection of \
the outputs for a screen. It can also set the screen size."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "xrandr-1.5.2-1.4.aarch64.rpm"
RPM_HASH = "132078b01dfc22f7c4fcbe4631a18f3b89e8cb3ec76a6e7519022f432105d55fb891b6ae0274c9753f3187ce3c868838e46f451c24d7db312129ef2803b26f69"

RPROVIDES:${PN} += "xrandr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libm.so.6"

inherit rpm
