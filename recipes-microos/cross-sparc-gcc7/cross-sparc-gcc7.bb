SUMMARY = "The GNU Compiler Collection targeting sparcv9"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparcv9. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-sparc-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "baf3b374fbbf31dae2d1ac61b51181f93acc44ac96dd0548b0d8d7b9fe2733a4f8ea68ea5001de0501272d207bb7127f88663da66c0d0d7d2de47708c32893ba"

RPROVIDES:${PN} += "cross-sparc-gcc7 cross-sparc-gcc7(aarch-64) liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-sparc-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
