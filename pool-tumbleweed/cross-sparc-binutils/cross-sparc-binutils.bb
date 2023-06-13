SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-sparc-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "ea0c6b3a5f261f46578011930b84ed2c0fae5a81109b051f95ef087b3dd65c114d9751a5fc76bed228d4baf449a17b63614d53b0c63b8019f9c47485d5dd1a4c"

RPROVIDES:${PN} += "cross-sparc-binutils \
cross-sparc-binutils(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
update-alternatives"

inherit rpm
