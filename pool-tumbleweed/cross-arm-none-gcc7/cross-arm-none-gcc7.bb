SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-arm-none-gcc7-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "d11a4435e189f9124727fab4f30024fb5d3c1d7c3f0e2e13f1c66e7b36cda721475414f0ce1357102aa1a4e5c497faabeabca3659c7d060b0ec8774ed9fa6bf8"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
