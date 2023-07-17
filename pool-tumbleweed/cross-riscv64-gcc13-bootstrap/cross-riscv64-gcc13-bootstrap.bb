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

RPM_NAME = "cross-riscv64-gcc13-bootstrap-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "c49ff653101dd1a51bef09aa9858a788ee9196925548f3e6491f3836c455f09cbe8d7ff02d214f9a55f058576262a85fdd9d5dd9ba99cf9479439e79291e7109"

RPROVIDES:${PN} += "cross-riscv64-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-riscv64-binutils \
update-alternatives"

inherit rpm
