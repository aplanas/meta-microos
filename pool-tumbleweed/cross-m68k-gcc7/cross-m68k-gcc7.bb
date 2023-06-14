SUMMARY = "The GNU Compiler Collection targeting m68k"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting m68k. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-m68k-gcc7-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "bfc24485eaa0a9e960e8629a46b6911b6da8b6a7d1731553ada82beb44e3035c737838ed70a2f2946224c5ecec41082492af96a928866079a26e9cc6c06ea452"

RPROVIDES:${PN} += "cross-m68k-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/bin/sh \
cross-m68k-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
