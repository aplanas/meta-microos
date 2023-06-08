SUMMARY = "The GNU Compiler Collection targeting sparc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-sparc64-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "51f4827c3ac5758001a2c4b78ab0d7b25d5d7c50a6467e7522c6e63e6321eff4546da9a4194ff1ca3dd6b9de01ba348be0ba86e43442a96568f050b6816aea7f"

RPROVIDES:${PN} += "cross-sparc64-gcc7 cross-sparc64-gcc7(aarch-64) liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-sparc64-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
