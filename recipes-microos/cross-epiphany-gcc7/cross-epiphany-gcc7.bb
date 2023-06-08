SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-epiphany-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "13cb2bb8c82023d2087ca03222b7b01461702d09cd4d8ecf3f1b26dd237bf5b4236c3f2b224d01c4827dff4bee5afcd91d082c806a502c0ce489171f138a481d"

RPROVIDES:${PN} += "cross-epiphany-gcc7 cross-epiphany-gcc7(aarch-64) epiphany-elf-gcc liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-epiphany-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
