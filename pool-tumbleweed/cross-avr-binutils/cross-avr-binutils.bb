SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-avr-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "ef4996abbaf046fc6452fe1818c3e0abaca8388d89b57f4d249daa6bd3e61ed1fc2e430c40ebe25c0e06ae4d962188113a26a34403689085039e89a435d4e7ce"

RPROVIDES:${PN} += "cross-avr-binutils \
cross-avr-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libzstd.so.1()(64bit) \
update-alternatives"

inherit rpm
