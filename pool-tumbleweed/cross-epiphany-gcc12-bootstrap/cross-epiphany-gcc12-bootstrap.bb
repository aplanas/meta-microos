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

PV = "12.3.0+git1204"

RPM_NAME = "cross-epiphany-gcc12-bootstrap-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "c5f33eb689f2574bf71314729ef8dae47a0791982fda6ca66f1db2eb899e6b6baa31bf8d43d70055b1530321ccfe191a685b5828e8f7eeb1f8a866324db430cf"

RPROVIDES:${PN} += "cross-epiphany-gcc12-bootstrap \
cross-epiphany-gcc12-bootstrap(aarch-64) \
epiphany-elf-gcc"
RDEPENDS:${PN} += "/bin/sh \
cross-epiphany-binutils \
update-alternatives"

inherit rpm
