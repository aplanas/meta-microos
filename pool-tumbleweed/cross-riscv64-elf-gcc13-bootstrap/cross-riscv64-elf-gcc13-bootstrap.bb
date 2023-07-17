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

PV = "13.1.1+git7552"

RPM_NAME = "cross-riscv64-elf-gcc13-bootstrap-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "af6b5565341fe41e0279c856c63bc86e0b1c70bc651e4fb5ce42ef1f82b165695284e37d601aea679d0d99bdd47cce7b4541b03d045c9020a8f8b54f47375065"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc13-bootstrap \
riscv64-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
update-alternatives"

inherit rpm
