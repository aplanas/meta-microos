SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-avr-gcc7-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "e5a4da6bdeba55d25e3227bfe6711b1960f7e98fa3baefba2d406553a289034e7e8285132839970003910325caa9628ee8fc05aa0c1efbb267680fbe67d86467"

RPROVIDES:${PN} += "cross-avr-gcc7 \
cross-avr-gcc7(aarch-64) \
liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
cross-avr-binutils \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
update-alternatives"

inherit rpm
