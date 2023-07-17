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

PV = "13.1.1+git7552"

RPM_NAME = "cross-pru-gcc13-bootstrap-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "9933d42f3a0e3ac9f2fdc20159998f02be35f9eb4b6fca4a4fbe66ee1fa7d67393c881b394556e249bedfdc06970a60ffd9e11d02a4d2fd0e16d809828c4bc29"

RPROVIDES:${PN} += "cross-pru-gcc13-bootstrap \
pru-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-pru-binutils \
update-alternatives"

inherit rpm
