SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-rx-gcc7-bootstrap-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "ac388b8add9764ffc7ac887d357a13cf293681758c6f6d1a8b9fbacbc1cda42bfb9de1bc768d21413194c30754b935d612390de97cde99b762ad1ff155fcba05"

RPROVIDES:${PN} += "cross-rx-gcc7-bootstrap cross-rx-gcc7-bootstrap(aarch-64) liblto_plugin.so.0()(64bit) rx-elf-gcc"
RDEPENDS:${PN} += "/bin/sh cross-rx-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
