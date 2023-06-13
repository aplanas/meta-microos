SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-ppc-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "a90255ece4fbe53422d5a165212aea8e8a2ed9937f45f5f2a4993d85336f586454f08de484d54cc68cda6904059f2abc7deb330f633140dba221a30a34eaab18"

RPROVIDES:${PN} += "cross-ppc-binutils \
cross-ppc-binutils(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libzstd.so.1()(64bit) \
update-alternatives"

inherit rpm
