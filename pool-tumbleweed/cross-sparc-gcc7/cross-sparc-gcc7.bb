SUMMARY = "The GNU Compiler Collection targeting sparcv9"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparcv9. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-sparc-gcc7-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "b9b9f8cdf1d29903c3dc15c2d77d54d20fbc66c818dd5a997bb662d26faca5d46479c7d05419d80d82107666cd68716db02661786ecc8fe2ea40cf20dac4ff04"

RPROVIDES:${PN} += "cross-sparc-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
