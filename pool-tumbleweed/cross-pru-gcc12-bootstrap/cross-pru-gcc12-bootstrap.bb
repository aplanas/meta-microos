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

PV = "12.3.0+git1204"

RPM_NAME = "cross-pru-gcc12-bootstrap-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "1859ddea4a84c2f0fe2c9faba6e64161d440b59d7bd6f3b962ec79ae2545e559b0160e20201c10007f261bf0ac86a9b3880b0dee05c794c2733d05f46ef180ec"

RPROVIDES:${PN} += "cross-pru-gcc12-bootstrap \
pru-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-pru-binutils \
update-alternatives"

inherit rpm
