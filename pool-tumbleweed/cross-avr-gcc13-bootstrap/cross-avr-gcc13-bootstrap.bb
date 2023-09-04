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

PV = "13.2.1+git7683"

RPM_NAME = "cross-avr-gcc13-bootstrap-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "905b807df3e4ab0fc4db0a08ddaef7923c1add1b99bf5a0dfc8e16963d4d2bb8952182c69f44d9fd5234b9c179f4e6e82d92e2a767c6297e27df75e3d6e88696"

RPROVIDES:${PN} += "cross-avr-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-avr-binutils \
update-alternatives"

inherit rpm
