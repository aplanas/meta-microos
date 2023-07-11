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

RPM_NAME = "cross-riscv64-gcc13-bootstrap-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "cb2e6a508a46c539ca921a7d07de267aab2cce269b0e0565078bcebea2b0a383b6f2aff8349be3f23fc55e9acce2f07becebd5d0a9a0e2644a04eac1f109c2d6"

RPROVIDES:${PN} += "cross-riscv64-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
update-alternatives"

inherit rpm
