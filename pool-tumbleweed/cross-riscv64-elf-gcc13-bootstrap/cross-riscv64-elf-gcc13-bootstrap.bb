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

RPM_NAME = "cross-riscv64-elf-gcc13-bootstrap-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "87514522047b32344ffc19bc80d1271adbeb62dd500089fa8d18c1736fa5c812b30a652b59a66d2ee7de928fe65334137032b4adaf9a60db6b78acc3a209fd7a"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc13-bootstrap \
riscv64-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
update-alternatives"

inherit rpm
