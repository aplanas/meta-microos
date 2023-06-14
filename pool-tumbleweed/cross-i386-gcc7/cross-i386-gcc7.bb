SUMMARY = "The GNU Compiler Collection targeting i386"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting i386. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-i386-gcc7-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "a1b25942ac8435f44eac8ffbc360c733138487216e9665eade0dd9cfcc69dfad1aa7c6fbe350fc68ddcc5a3743a241bbe9fce819b813438f679a53f47a448fac"

RPROVIDES:${PN} += "cross-i386-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/bin/sh \
cross-i386-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
