SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-s390-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "ce255d492d5ca1516a34d064322594c74577b01a93199e65c289221775b9f833d3280de1994027bd7e5d114425cce003bb93f141f10807ccf98a7e4c3eaceba1"

RPROVIDES:${PN} += "cross-s390-binutils \
cross-s390-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libzstd.so.1()(64bit) \
update-alternatives"

inherit rpm
