SUMMARY = "The GNU Compiler Collection targeting arm"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-arm-gcc7-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "9afb4f9cc68510db1ea539a167e8cdd6bdbb2fa852fac8973404727c4ebcf2d32c3d8d2e55b9414f77981fa94b53a5183be44a7862a9ededbc7fb6234252091c"

RPROVIDES:${PN} += "cross-arm-gcc7 \
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
