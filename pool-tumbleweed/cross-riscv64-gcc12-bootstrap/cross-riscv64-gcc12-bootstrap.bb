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

RPM_NAME = "cross-riscv64-gcc12-bootstrap-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "c792c93f4ed1b33fff2240f26318184195aaca3ffddd21ba37216ee7bb1989ac731520bdb140c00909ac3accaecd34435fdf2ff1515e39d46df6102ceb1d4e46"

RPROVIDES:${PN} += "cross-riscv64-gcc12-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
update-alternatives"

inherit rpm
