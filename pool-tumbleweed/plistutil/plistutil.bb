SUMMARY = "Library for handling Apple Binary and XML Property Lists"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists. \
 \
This package contains an utility to convert PList files from binary to XML and \
from XML to binary."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.3.0"

RPM_NAME = "plistutil-2.3.0-1.2.aarch64.rpm"
RPM_HASH = "06762c8e0bde6355f4c052651b3584387eb008e178b8f3145918a9e42add591b7cfbf53b2dfabfc8940e65918cdfbe2e3c79d4fbc8ed1507876430f86d444629"

RPROVIDES:${PN} += "plistutil \
plutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libplist-2-0-4 \
libplist-2.0.so.4"

inherit rpm
