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

PV = "13.0.1+git7231"

RPM_NAME = "cross-epiphany-gcc13-bootstrap-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "7046de93ef4abaf7bc44344cd027fc54843cd10d235ceb8aafcb189d8a070d76daafb869e7ce50edbd1bd4452c1c51319c4cb685b7c7c19500ccfa6a5bf3aa02"

RPROVIDES:${PN} += "cross-epiphany-gcc13-bootstrap cross-epiphany-gcc13-bootstrap(aarch-64) epiphany-elf-gcc"
RDEPENDS:${PN} += "/bin/sh cross-epiphany-binutils update-alternatives"

inherit rpm
