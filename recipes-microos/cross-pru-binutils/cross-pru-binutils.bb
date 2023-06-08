SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-pru-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "c3b0fee7ac8827b62c95824b0d11c5fbcc52c93453a409a48031833cc1fe73e5e9889bb985a9c911d10b582ae3287314f2d6c9ea5acb3db75115b28857c91c8f"

RPROVIDES:${PN} += "cross-pru-binutils cross-pru-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
