SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-avr-gcc12-bootstrap-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "6abb3aa2be19960718af4c6c9052899766ddb09b1c293114c3b7eb5ea27dda63064874db75daf59c2a18ea6259dda28d47efebe4fd06a0080a1a2eb4201756ec"

RPROVIDES:${PN} += "cross-avr-gcc12-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-avr-binutils \
update-alternatives"

inherit rpm
