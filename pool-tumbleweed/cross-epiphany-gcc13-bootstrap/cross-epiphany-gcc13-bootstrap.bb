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

RPM_NAME = "cross-epiphany-gcc13-bootstrap-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "a686c1cddf640639a0acf85f22fa1c9055f1a61370eb8a1f73d89147a1229836655664a513f250758e44a4efd814957fd457f4faad07edddac8346e7a25a40cd"

RPROVIDES:${PN} += "cross-epiphany-gcc13-bootstrap \
epiphany-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-epiphany-binutils \
update-alternatives"

inherit rpm
