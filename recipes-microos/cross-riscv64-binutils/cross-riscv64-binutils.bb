SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-riscv64-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "04480fbfe3a16fdbf73eb081cdc669878c0947ac0416d114995e54e1a1e13332049219698bc6f4450480fffb3c28044bde2e9eec78aca5bccc407535c0763d83"

RPROVIDES:${PN} += "cross-riscv64-binutils cross-riscv64-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
