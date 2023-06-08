SUMMARY = "The GNU Compiler Collection targeting ppc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-ppc64-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "231950da132a75096d4535629a0d901c39e0892e6fe29d6f59367be760daf46cef5fdf298d6e4418bb90a64f37098f48bcf5f30f6558f43e888237e1c43ad88f"

RPROVIDES:${PN} += "cross-ppc64-gcc7 cross-ppc64-gcc7(aarch-64) liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-ppc64-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
