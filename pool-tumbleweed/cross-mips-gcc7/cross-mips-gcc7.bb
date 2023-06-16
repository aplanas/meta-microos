SUMMARY = "The GNU Compiler Collection targeting mips"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting mips. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-mips-gcc7-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "e4a9869a72564397580c39d58144d4c2433d05bf8af4101a979760a044d91717487551f1076ca4048e0187c82aa5724307c4cae8919e9deb4ef6cc103a1a0763"

RPROVIDES:${PN} += "cross-mips-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-mips-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
