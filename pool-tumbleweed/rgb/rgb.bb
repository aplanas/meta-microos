SUMMARY = "X color name database"
DESCRIPTION = "This package includes both the list mapping X color names to RGB values \
(rgb.txt) and, if configured to use a database for color lookup, the \
rgb program to convert the text file into the binary database format."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "rgb-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "8cdecb5ed126bcce87225cc1b093a7d8b5b96ea2baafea8c8c69765b8d582c323ff0da952fed1e3a0609d1c516e2992aa45de416213624cb44b6e212fb036185"

RPROVIDES:${PN} += "rgb \
rgb(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
