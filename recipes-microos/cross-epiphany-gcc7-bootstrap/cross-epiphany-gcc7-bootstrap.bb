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

RPM_NAME = "cross-epiphany-gcc7-bootstrap-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "37374bc4c2a0f86c284bee7314d3bde1e23acbef2a3d6df84d87a567e9b2d9e2c4253a06626f9a3c929cb102a33e232cad633a32e56c7fa00d30c1353c175890"

RPROVIDES:${PN} += "cross-epiphany-gcc7-bootstrap cross-epiphany-gcc7-bootstrap(aarch-64) epiphany-elf-gcc liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-epiphany-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
