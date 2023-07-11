SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-arm-none-gcc13-bootstrap-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "476cb2b740ead7b4e6a1e337f0570371077c01fd41f6e25859ddfdbec3894178299072dd4ece1fdc5dcd4ead89bde27160a08de01e82397e589c6e457f9555b8"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
update-alternatives"

inherit rpm
