SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-s390x-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "a6fc8c2a618ed48884b7f23cb91cf6566634c08202c25cec53058d806a457d9a6c6ed9e56f2bf7791afca65a1ec2129451e82f59895e7da5bd2d5f5673a3db90"

RPROVIDES:${PN} += "cross-s390x-binutils cross-s390x-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
