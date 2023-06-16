SUMMARY = "The GNU Compiler Collection targeting arm"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-arm-gcc7-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "808dbf5b792b8143287f1c0469bb444874fc8f5eecbeff63a49bb80cc4d6953de8e9be7ab75c947220e400d2b87d00dcbecf4a0521798c36816c9dbb43c8a2d2"

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
