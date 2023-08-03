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

PV = "13.1.1+git7597"

RPM_NAME = "cross-avr-gcc13-bootstrap-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "6930eac1dcdde0b9310b20395374ba60b625bde0301f12012ae1b716bd3b6ded3fe445db2eaca3b521bb9ce20cf00a47068e167ea50f4560af1a46c6b7b8c703"

RPROVIDES:${PN} += "cross-avr-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-avr-binutils \
update-alternatives"

inherit rpm
