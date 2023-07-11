SUMMARY = "The GNU Compiler Collection targeting pru"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting pru. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-pru-gcc13-bootstrap-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "75f5c3c305e78e19bff2f41fb981f2bfd9bd465c690e0adb659d5cf9d0f4a71806099821eb9445c8a874d6251aa9bd0c0115ee886f71db75f7944c808d46ade0"

RPROVIDES:${PN} += "cross-pru-gcc13-bootstrap \
pru-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-pru-binutils \
update-alternatives"

inherit rpm
