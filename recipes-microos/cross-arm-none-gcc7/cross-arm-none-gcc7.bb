SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-arm-none-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "49850cb7c9862bedd050a20483a5ebbf76cad1697db54759aa00202001ddffc9f50190a15e61ea965b942887eb3a88a7e8c819c1d83bb2652cea6dfd06eb1d3d"

RPROVIDES:${PN} += "arm-none-eabi-gcc cross-arm-none-gcc7 cross-arm-none-gcc7(aarch-64) liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-arm-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
