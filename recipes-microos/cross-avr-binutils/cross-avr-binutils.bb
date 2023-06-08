SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-avr-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "e5201f16742d487563ed00e34eea76d67d4534da3bc12664e197d360ed5d2e48341c379899f374f59999a932c8653f920ac8970a85b8ad20cd9d406848dbba53"

RPROVIDES:${PN} += "cross-avr-binutils cross-avr-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
