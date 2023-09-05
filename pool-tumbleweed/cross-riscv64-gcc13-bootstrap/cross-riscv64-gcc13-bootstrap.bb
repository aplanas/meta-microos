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

RPM_NAME = "cross-riscv64-gcc13-bootstrap-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "66085b97e0a0472b656d93d60e564552d23fa4afdcd56f9fefe7ec46fcb930ed3f20d717718234c3ff1554d8a69f6ab048b5d524359bd86136a618e1a546281d"

RPROVIDES:${PN} += "cross-riscv64-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
update-alternatives"

inherit rpm
