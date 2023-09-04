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

PV = "13.2.1+git7683"

RPM_NAME = "cross-riscv64-elf-gcc13-bootstrap-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "23a11c1eba499ac92a9960e11c2e5554f5a94563bfb5da9e34f48991aef880962680aa755b5b86faa8f301bef7d3388550d2eb5e88e5c7efe365d3efbe2f3d4a"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc13-bootstrap \
riscv64-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
update-alternatives"

inherit rpm
