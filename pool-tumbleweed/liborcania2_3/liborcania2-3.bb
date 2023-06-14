SUMMARY = "MISC function library"
DESCRIPTION = "Different functions for different purposes but that can be shared \
between other projects."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.2"

RPM_NAME = "liborcania2_3-2.3.2-1.3.aarch64.rpm"
RPM_HASH = "0233c4b527b79ad5baf2385d74ea9edfe2727ea7d51f85056e2eb47df44a49fe8b5a43012441a925954a78cf6fd6ae98728633cd90fc6199489c59d95aa76e7d"

RPROVIDES:${PN} += "liborcania.so.2.3 \
liborcania2-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
