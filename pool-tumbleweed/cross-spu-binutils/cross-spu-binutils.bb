SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-spu-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "92a0e202ab8cf97572aa50f915f02bcd747e76f20f619cee7444bf6ff33739855f9839ce802318c91f9fc01d4ceeb308b530a752d02b874fa465ba4b159bd8dc"

RPROVIDES:${PN} += "cross-spu-binutils \
cross-spu-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libzstd.so.1()(64bit) \
update-alternatives"

inherit rpm
