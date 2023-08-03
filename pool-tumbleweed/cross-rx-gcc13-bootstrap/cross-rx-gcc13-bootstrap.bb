SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-rx-gcc13-bootstrap-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "7f82b97b768bf9744a84670ebcc084e47f199d667be4210c31835a28028fdba6867b021d18073457738ced2387d0e3bec7209b7953fd3b93acddf57efb217ecc"

RPROVIDES:${PN} += "cross-rx-gcc13-bootstrap \
rx-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-rx-binutils \
update-alternatives"

inherit rpm
