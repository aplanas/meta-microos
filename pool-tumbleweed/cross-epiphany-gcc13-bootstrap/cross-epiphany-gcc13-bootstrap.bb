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

RPM_NAME = "cross-epiphany-gcc13-bootstrap-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "e5f4ca39db910efca901a81a4bf10c537fe21b9ed42d6af6442c83adb75d8899cd11109959cf634738543176981bb3deda29b61bd9be96a60dadd26f2b73b220"

RPROVIDES:${PN} += "cross-epiphany-gcc13-bootstrap \
epiphany-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-epiphany-binutils \
update-alternatives"

inherit rpm
