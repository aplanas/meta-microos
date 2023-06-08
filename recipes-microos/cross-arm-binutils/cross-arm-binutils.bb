SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-arm-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "5778bf5048c96882159dddd125c12b2db1e47c14e388b1e301304f2eaaafe3cce6ca5ce5ea442590523b11c2421661ec23dde40b3113f69aee713635e912c495"

RPROVIDES:${PN} += "cross-arm-binutils cross-arm-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
