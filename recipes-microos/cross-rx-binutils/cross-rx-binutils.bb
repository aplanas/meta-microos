SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-rx-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "1c3b7fca6d59f15788ee561e9039dccaae60482a12bcaa681b8e772b5bedf99b78cbda364c19a1bf1b673da3d04a4ebfc96ba049a8bc068fbe8b10fb36a3f6a1"

RPROVIDES:${PN} += "cross-rx-binutils cross-rx-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
