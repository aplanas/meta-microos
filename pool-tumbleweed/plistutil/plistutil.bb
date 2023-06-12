SUMMARY = "Library for handling Apple Binary and XML Property Lists"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists. \
 \
This package contains an utility to convert PList files from binary to XML and \
from XML to binary."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "plistutil-2.2.0-4.7.aarch64.rpm"
RPM_HASH = "03cf91df1450c5a8f3bf868227dbdd65814b75acf0ac4bf4ba122b16cd219722bdedfac55cc4ff7829ca7c2dfa8140d79a6cf0762ce3257dd09e514d7f55783c"

RPROVIDES:${PN} += "plistutil \
plistutil(aarch-64) \
plutil"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libplist-2.0.so.3()(64bit) \
libplist-2_0-3"

inherit rpm
