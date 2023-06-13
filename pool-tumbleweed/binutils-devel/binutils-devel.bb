SUMMARY = "GNU binutils (BFD development files)"
DESCRIPTION = "This package includes header files and static libraries necessary to \
build programs which use the GNU BFD library, which is part of \
binutils."
LICENSE = "GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "binutils-devel-2.40-5.1.aarch64.rpm"
RPM_HASH = "101c833dc4def85bd9d9d75fb4aa03d5e8aaafd93fb9d36d7db30b5aa3639f6d209a3ac470171576f8a14185d4082910abd5c2ab1575e13bf448507ea34aabdd"

RPROVIDES:${PN} += "binutils-devel \
binutils-devel(aarch-64) \
binutils:/usr/include/bfd.h"

RDEPENDS:${PN} += "binutils \
zlib-devel"

inherit rpm
