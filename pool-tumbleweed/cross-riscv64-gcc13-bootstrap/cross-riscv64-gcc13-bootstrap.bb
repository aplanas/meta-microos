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

RPM_NAME = "cross-riscv64-gcc13-bootstrap-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "e5b9894254a1ce6359c9924205142da90a63ec8541ff76ec477c64dcc73fc83aa0bf16da7236ae12eeb1fd3f903f0429307c1086dc514bdd0278b0c59772e409"

RPROVIDES:${PN} += "cross-riscv64-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
update-alternatives"

inherit rpm
