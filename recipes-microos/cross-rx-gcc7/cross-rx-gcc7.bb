SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-rx-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "31f729de140816f04a2a74a524a606f16f4b3ea3bc604794a8da8625cfde9a4dc1373bc9842d31b0b796724a0996e5203f77c880c872a63e943572fbcbf05add"

RPROVIDES:${PN} += "cross-rx-gcc7 cross-rx-gcc7(aarch-64) liblto_plugin.so.0()(64bit) rx-elf-gcc"
RDEPENDS:${PN} += "/bin/sh cross-rx-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
