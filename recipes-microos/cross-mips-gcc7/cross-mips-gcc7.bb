SUMMARY = "The GNU Compiler Collection targeting mips"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting mips. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-mips-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "336b5bd255687a304a1f7563341d3796c7ba651271e2183cf517f1cf60a950c4f461bbaea12e0a385eb670bd1b8d2847511b0cd8109ac2d7f7a8d50926f05711"

RPROVIDES:${PN} += "cross-mips-gcc7 cross-mips-gcc7(aarch-64) liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-mips-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
