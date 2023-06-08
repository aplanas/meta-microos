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

PV = "11.3.1+git2076"

RPM_NAME = "cross-riscv64-gcc11-bootstrap-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "cd3a280f1392cd7efb5a1ffb8f6cbd6dc0568ffe06106a766df246bc71f966038a872fd71d2ba07ec695a195122926d5b0d45354dd82a7ea819c44430226c2a8"

RPROVIDES:${PN} += "cross-riscv64-gcc11-bootstrap cross-riscv64-gcc11-bootstrap(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-riscv64-binutils update-alternatives"

inherit rpm
