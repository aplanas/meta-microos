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

PV = "13.1.1+git7364"

RPM_NAME = "cross-epiphany-gcc13-bootstrap-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "1a0ec8917eeeb53f0e41727ada751122431b274e75231a659e35e1f0712d855f291905f4366bd2d029137c71ec45dedc17d7f9dd384bf46adb9b9b337ce356d9"

RPROVIDES:${PN} += "cross-epiphany-gcc13-bootstrap \
cross-epiphany-gcc13-bootstrap(aarch-64) \
epiphany-elf-gcc"

RDEPENDS:${PN} += "/bin/sh \
cross-epiphany-binutils \
update-alternatives"

inherit rpm
