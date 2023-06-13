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
cross-arm-gcc7(aarch-64) \
liblto_plugin.so.0()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
cross-arm-binutils \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
update-alternatives"

inherit rpm
