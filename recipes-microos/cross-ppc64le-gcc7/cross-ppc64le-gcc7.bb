SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-ppc64le-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "436fa070c22fc2ac9a01b6b4c988f002aee0684e0b7d409cc0ebdeb6ab46591d338baff5088f4c9cd29215d34b0ccecbbfb0ff142ff5fa6cff37a07472682ab4"

RPROVIDES:${PN} += "cross-ppc64le-gcc7 cross-ppc64le-gcc7(aarch-64) liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-ppc64le-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
