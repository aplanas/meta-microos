SUMMARY = "Library for Neighbor Discovery Protocol"
DESCRIPTION = "This package contains a library which provides a wrapper for IPv6 Neighbor \
Discovery Protocol.  It also provides a tool named ndptool for sending and \
receiving NDP messages."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8"

RPM_NAME = "libndp-1.8-1.6.aarch64.rpm"
RPM_HASH = "1416585ea6105699e0b101744b05cf0692e6906b91ef120dd902f94c3f9906d687c7983416fa5b650d5330d219a99571193f72f6afb6b318b276882dc59d2430"

RPROVIDES:${PN} += "libndp \
libndp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libndp.so.0()(64bit)"

inherit rpm
