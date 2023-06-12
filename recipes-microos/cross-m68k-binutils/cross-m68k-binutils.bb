SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-m68k-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "f7f3834d0276918fe5ca118944c8dd5f0a0caa005e01b007fea1b3bdb6898a36ec2359201c360ee896c6f912f87746ad77abe61e4e35d973d47a746334ab2e0d"

RPROVIDES:${PN} += "cross-m68k-binutils cross-m68k-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
