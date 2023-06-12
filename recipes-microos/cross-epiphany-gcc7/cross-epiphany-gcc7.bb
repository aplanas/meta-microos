SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-epiphany-gcc7-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "c0c7a031f3f82311dbcc19ea118c898d9877226840bfaab6adb5e40970497d54fadc89a588d3f1382f85640b3ef5fb28706a13b94183aa916ef1a8fceebadd77"

RPROVIDES:${PN} += "cross-epiphany-gcc7 \
cross-epiphany-gcc7(aarch-64) \
epiphany-elf-gcc \
liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
cross-epiphany-binutils \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
update-alternatives"

inherit rpm
