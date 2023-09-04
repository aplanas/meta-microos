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

PV = "13.2.1+git7683"

RPM_NAME = "cross-arm-none-gcc13-bootstrap-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "a8cbaadbecbf2e27402b270216ba494fe4cb727765e50ad0ae6b59dc43304626c354abb26e6742fcb52880a318e73492d48e0d611b001f51d2c32b6e97d11ca3"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
update-alternatives"

inherit rpm
