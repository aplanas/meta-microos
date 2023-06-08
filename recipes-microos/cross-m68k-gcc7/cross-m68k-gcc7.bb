SUMMARY = "The GNU Compiler Collection targeting m68k"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting m68k. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-m68k-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "d7c37e3797b3febdb3b118e0244c640a5c7d46bcf8ff7e8117aa5c3a2ae9d0129035f22216749c43bfa04272069ac37cf0b40f813180096763a0f833528434ea"

RPROVIDES:${PN} += "cross-m68k-gcc7 cross-m68k-gcc7(aarch-64) liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-m68k-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
