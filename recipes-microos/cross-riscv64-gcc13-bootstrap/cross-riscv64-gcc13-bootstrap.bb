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

RPM_NAME = "cross-riscv64-gcc13-bootstrap-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "d68a4e15a36c5c77ccb602becbd302dc9b6c0deb82401ced7d50d58bb5958ce0b5ef05421470fc78f7ca28b0c4840e47e9714c2ecec8818ccc63d46c4e0ec64a"

RPROVIDES:${PN} += "cross-riscv64-gcc13-bootstrap \
cross-riscv64-gcc13-bootstrap(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
cross-riscv64-binutils \
update-alternatives"

inherit rpm
