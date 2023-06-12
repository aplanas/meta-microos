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

RPM_NAME = "cross-pru-gcc13-bootstrap-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "e852f283eca2eeb32dd506da52ab693cca2fdbddd9f496b9b662c56c1fc01e255ffdf7ef79c1a6a7aab096b3647774db2c5ec51a4c9c6374560d3045ff21191c"

RPROVIDES:${PN} += "cross-pru-gcc13-bootstrap \
cross-pru-gcc13-bootstrap(aarch-64) \
pru-gcc"
RDEPENDS:${PN} += "/bin/sh \
cross-pru-binutils \
update-alternatives"

inherit rpm
