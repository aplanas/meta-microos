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

PV = "13.1.1+git7552"

RPM_NAME = "cross-avr-gcc13-bootstrap-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "a886cabad5c195fd035148345a8cc8dd0e80cf9850b4b0b5c9a05a4aa9931ca1d00e92caeb9e5ef1f0e807568413dc95332b7ac1cf472c5fe8c99af63e538c8e"

RPROVIDES:${PN} += "cross-avr-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-avr-binutils \
update-alternatives"

inherit rpm
