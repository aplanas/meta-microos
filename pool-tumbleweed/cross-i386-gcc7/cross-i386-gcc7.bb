SUMMARY = "The GNU Compiler Collection targeting i386"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting i386. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-i386-gcc7-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "dc70ac16042cec65488f5f0835ab79f0edebd65588d4cce64d7c473b058e182b7b0eae0d82bb33db0ee296662e62679a4a9fda7327099781dc28b266b86a6bf7"

RPROVIDES:${PN} += "cross-i386-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-i386-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
