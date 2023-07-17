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

PV = "13.1.1+git7552"

RPM_NAME = "cross-epiphany-gcc13-bootstrap-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "816611a81cdbb95e10571f65c30d17e35eb903af62e12623d2aa9623e160d7121046565bfdaa106a4e7fb71975be27a42909cb58daf6480888c80178dfe94d26"

RPROVIDES:${PN} += "cross-epiphany-gcc13-bootstrap \
epiphany-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-epiphany-binutils \
update-alternatives"

inherit rpm
