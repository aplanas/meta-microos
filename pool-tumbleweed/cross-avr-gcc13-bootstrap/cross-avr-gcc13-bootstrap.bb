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

PV = "13.1.1+git7364"

RPM_NAME = "cross-avr-gcc13-bootstrap-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "63e370912311abe3b92146f7a769b5009714f7e5f46657e8d82f248ef48a7d9f4d7a7215a5f58685c9fc180a02e1b8bcb05ffc1c8b57c431ab72939c1cd05f16"

RPROVIDES:${PN} += "cross-avr-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-avr-binutils \
update-alternatives"

inherit rpm
