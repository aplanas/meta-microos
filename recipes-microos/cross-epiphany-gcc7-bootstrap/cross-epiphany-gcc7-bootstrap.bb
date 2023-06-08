SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-epiphany-gcc7-bootstrap-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "25686241e102ac8c38e97c263d0d68c1bd556cd6207a02fcb0c0d67401f3199da558533254dcc337ed649c6d505d68b62677261e03cc5a70c392c1d24eb30978"

RPROVIDES:${PN} += "cross-epiphany-gcc7-bootstrap cross-epiphany-gcc7-bootstrap(aarch-64) epiphany-elf-gcc liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-epiphany-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
