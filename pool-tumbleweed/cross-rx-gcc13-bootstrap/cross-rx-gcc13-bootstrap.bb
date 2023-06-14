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

PV = "13.1.1+git7364"

RPM_NAME = "cross-rx-gcc13-bootstrap-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "9a642a2e149307c185a0543a0d7061d70cb5f5eaa7f5d9561f8a16c76a98aeaf111259f20500b7d4064b887fbcd16977beda87b2f45ad194cd5ee2c22628af02"

RPROVIDES:${PN} += "cross-rx-gcc13-bootstrap \
rx-elf-gcc"

RDEPENDS:${PN} += "/bin/sh \
cross-rx-binutils \
update-alternatives"

inherit rpm
