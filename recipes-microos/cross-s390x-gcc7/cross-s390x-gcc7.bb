SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-s390x-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "09dc5826fd024bc9aea76287f082c46e051df01f31183efd63460d34ac0890533191e07c1501f94a50a9e1d354d596f7f7ef0591022abcd3a9f69bfbe7a10d3a"

RPROVIDES:${PN} += "cross-s390x-gcc7 cross-s390x-gcc7(aarch-64) liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-s390x-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
