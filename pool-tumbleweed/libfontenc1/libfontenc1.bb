SUMMARY = "X11 font encoding library"
DESCRIPTION = "The libfontenc library is used by the Xorg server and other X font \
tools for handling fonts with different character set encodings."
LICENSE = "MIT"

PV = "1.1.7"

RPM_NAME = "libfontenc1-1.1.7-1.3.aarch64.rpm"
RPM_HASH = "f1c2dd2c7e45f7fcf7abf5a99a0c70ba9f2c8c5e3b656d2f1f9ee06ab3019106bd068e8816fe9412193a5ae120c203262385510a26a5b287013433daa720987d"

RPROVIDES:${PN} += "libfontenc.so.1 \
libfontenc1 \
xorg-x11-libfontenc"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
