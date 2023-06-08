SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-bpf-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "2df9d1b5090970706d31c3fe78a0f82be08d919b3ea9e3a3478855d51ca9a27f29ad8258a3f3b88e473bf7bec0620e16d20349f55abc7082526a75b674503a9f"

RPROVIDES:${PN} += "cross-bpf-binutils cross-bpf-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
