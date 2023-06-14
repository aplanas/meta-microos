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

PV = "13.1.1+git7364"

RPM_NAME = "cross-riscv64-elf-gcc13-bootstrap-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "a50900b0c9709a12577cc97ca028608dc6670502bf8c07129164a8e1e63ef417a03509580a52879d4a798c1db135aa65b80aafa63cbc1d6c75863e4077888792"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc13-bootstrap \
riscv64-elf-gcc"

RDEPENDS:${PN} += "/bin/sh \
cross-riscv64-binutils \
update-alternatives"

inherit rpm
