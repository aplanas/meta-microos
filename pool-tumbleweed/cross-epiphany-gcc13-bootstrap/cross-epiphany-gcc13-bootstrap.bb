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

PV = "13.2.1+git7683"

RPM_NAME = "cross-epiphany-gcc13-bootstrap-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "5305d987458bb894f11341ea859eb81c6287293c2a2c5b2375a400407d3db7af072c965ba17b32fe08cafb5f85b96499998e9a11213462436e13cf20c1e7fd5e"

RPROVIDES:${PN} += "cross-epiphany-gcc13-bootstrap \
epiphany-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-epiphany-binutils \
update-alternatives"

inherit rpm
