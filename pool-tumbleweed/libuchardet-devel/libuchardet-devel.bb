SUMMARY = "Universal Charset Detection Library"
DESCRIPTION = "uchardet is a C language binding of the original C++ implementation of \
the universal charset detection library by Mozilla. \
 \
uchardet is an encoding detector library, which takes a sequence of \
bytes in an unknown character encoding without any additional \
information, and attempts to determine the encoding of the text. \
 \
This package contains the development files."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.0.8"

RPM_NAME = "libuchardet-devel-0.0.8-1.4.aarch64.rpm"
RPM_HASH = "f1db5c66a6f2ed571d834b4ff8cd3780f6a27fd6aa29ea26cbef5ef8ccd21db35dcfd7015e0f89048b15a2a4c6a5538f9faa90e58a22e305b1c29756975d99f7"

RPROVIDES:${PN} += "cmake-uchardet \
libuchardet-devel \
pkgconfig-uchardet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuchardet0"

inherit rpm
