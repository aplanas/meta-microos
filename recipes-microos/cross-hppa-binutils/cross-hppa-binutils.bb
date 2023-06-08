SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-hppa-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "5121f48af3e21aaa608f025eba11a59aacb68a1b9ce769958dbbc2b9c4c9bf7269b35816f13ff1abcc437d572e4405dc6c005010e6ca45d33ce9f35b3f18a966"

RPROVIDES:${PN} += "cross-hppa-binutils cross-hppa-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
