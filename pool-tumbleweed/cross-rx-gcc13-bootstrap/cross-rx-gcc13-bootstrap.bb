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

PV = "13.2.1+git7683"

RPM_NAME = "cross-rx-gcc13-bootstrap-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "ff7bb4d71f90c05770ded641629f26869ac0f12dc4a114d367f2d06d923e15104c0fd3c47a6b5ba9556470b9ffca5e28d07e1bc6a2150434441089aed6c331ff"

RPROVIDES:${PN} += "cross-rx-gcc13-bootstrap \
rx-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-rx-binutils \
update-alternatives"

inherit rpm
