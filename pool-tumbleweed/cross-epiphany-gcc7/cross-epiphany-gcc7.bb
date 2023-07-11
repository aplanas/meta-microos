SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-epiphany-gcc7-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "cff3c4170f782f8e2cf46f7d9cc020635587bfb88da2ce62350bb8156969c2ddfb6ddba7ac2a9ef0b3bc37b910207ff4e831a617997a1ccda1863a2e791fee62"

RPROVIDES:${PN} += "cross-epiphany-gcc7 \
epiphany-elf-gcc \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-epiphany-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
