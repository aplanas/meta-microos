SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-arm-none-gcc7-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "d11a4435e189f9124727fab4f30024fb5d3c1d7c3f0e2e13f1c66e7b36cda721475414f0ce1357102aa1a4e5c497faabeabca3659c7d060b0ec8774ed9fa6bf8"

RPROVIDES:${PN} += "arm-none-eabi-gcc cross-arm-none-gcc7 cross-arm-none-gcc7(aarch-64) liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-arm-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
