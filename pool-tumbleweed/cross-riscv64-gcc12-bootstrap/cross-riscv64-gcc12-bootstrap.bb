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

RPM_NAME = "cross-riscv64-gcc12-bootstrap-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "d6f6dc5b70f7935cb5dfd1ec4dde5294b12b6b1a62ff1cd04148be08d8d249f44d890200616c2e19ee08ad099009cda77220a54548b7b83b360fba84627b06f2"

RPROVIDES:${PN} += "cross-riscv64-gcc12-bootstrap \
cross-riscv64-gcc12-bootstrap(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
cross-riscv64-binutils \
update-alternatives"

inherit rpm
