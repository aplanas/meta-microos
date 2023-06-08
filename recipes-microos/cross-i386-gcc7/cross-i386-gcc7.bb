SUMMARY = "The GNU Compiler Collection targeting i386"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting i386. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-i386-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "9539fd8f7087e656b883b3efc0f266592557952322d7e3537cc87747f8a90058d74d2d985960dff85de430410f6eb69a9e29afed1a13887ece6c262ce621a8a6"

RPROVIDES:${PN} += "cross-i386-gcc7 cross-i386-gcc7(aarch-64) liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-i386-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
