SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-riscv64-elf-gcc13-bootstrap-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "a747255a71a5f88e61627d9fdd3a20660cc0788aa230863a382b21e0993d2017ecada9533bc536b946cd835c4d7a04ec73123e76e746131215837e93827e877f"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc13-bootstrap cross-riscv64-elf-gcc13-bootstrap(aarch-64) riscv64-elf-gcc"
RDEPENDS:${PN} += "/bin/sh cross-riscv64-binutils update-alternatives"

inherit rpm
