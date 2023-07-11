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

PV = "12.3.0+git1204"

RPM_NAME = "cross-riscv64-elf-gcc12-bootstrap-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "ac4b3688eda27b81a41096f5cb81c4c6262cd2fa8c4565785f4c408fb77785ddc2616f4fe5271e4be1fa822a9b1032679ead6f78208b9e3cd56567390b980671"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc12-bootstrap \
riscv64-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
update-alternatives"

inherit rpm
