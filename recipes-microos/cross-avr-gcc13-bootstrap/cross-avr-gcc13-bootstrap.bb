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

PV = "13.0.1+git7231"

RPM_NAME = "cross-avr-gcc13-bootstrap-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "c8316d024e4162284f8063fb8d1d1cb96f3c13fc911f0e61cb6cdaa0667e4549535d6cf1f5158b72cb01b208e8be2af0a33b9601b28f20a2ef91767d7738de94"

RPROVIDES:${PN} += "cross-avr-gcc13-bootstrap cross-avr-gcc13-bootstrap(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-avr-binutils update-alternatives"

inherit rpm
