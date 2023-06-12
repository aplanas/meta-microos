SUMMARY = "Utility to print an X window dump"
DESCRIPTION = "xpr takes as input a window dump file produced by xwd \
and formats it for output on various types of printers."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "xpr-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "8f576e17a254ac5e35d3413bf569da9a4a95ef645b18a71073469598ac4493fcc320a00d96a41c62a852e83510cb585779edc473b5aa22ee5ac3a9b8656e0d03"

RPROVIDES:${PN} += "xpr \
xpr(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXmuu.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm