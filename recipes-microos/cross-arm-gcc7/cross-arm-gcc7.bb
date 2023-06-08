SUMMARY = "The GNU Compiler Collection targeting arm"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-arm-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "02f8a84f4b979df70772fdf46054246ede8ea2e57c71c93bbb502d449a3cbf301b783342a8e0b99775662e063c899c3e5804d62ff98d47fdcf3ece86e42eaf53"

RPROVIDES:${PN} += "cross-arm-gcc7 cross-arm-gcc7(aarch-64) liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-arm-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
