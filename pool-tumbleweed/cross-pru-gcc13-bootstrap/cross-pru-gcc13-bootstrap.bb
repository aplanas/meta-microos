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

PV = "13.1.1+git7597"

RPM_NAME = "cross-pru-gcc13-bootstrap-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "157bbd88dc67c7620216fe28191118ae0537ac5b161e360560102f77c5d29c493c3f82efbf074ef5f05a93ae285f17b9a2093fe89ce5eedcde5d0fc5682c9070"

RPROVIDES:${PN} += "cross-pru-gcc13-bootstrap \
pru-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-pru-binutils \
update-alternatives"

inherit rpm
