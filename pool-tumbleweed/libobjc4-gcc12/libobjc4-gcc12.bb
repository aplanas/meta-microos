SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libobjc4-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "a256a230674a1c506b84f96082a4c7f1f80a20907a0fed140b99f5860d7de34e5ca1172e24704b3f655e297063211d2231b7ac2508842afdb634528938299d44"

RPROVIDES:${PN} += "libobjc.so.4()(64bit) \
libobjc4 \
libobjc4-gcc12 \
libobjc4-gcc12(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit)"

inherit rpm
