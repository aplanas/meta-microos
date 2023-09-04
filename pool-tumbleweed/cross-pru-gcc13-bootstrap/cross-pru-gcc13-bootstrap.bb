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

PV = "13.2.1+git7683"

RPM_NAME = "cross-pru-gcc13-bootstrap-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "ec8bb7bc0fd75868bccb12315f733a827c5c795a93dcc75366eb306f57cb6c602f243b7aafebce598af39f1c2a5d692c0b93cbe6027148a3ffa852c08040224c"

RPROVIDES:${PN} += "cross-pru-gcc13-bootstrap \
pru-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-pru-binutils \
update-alternatives"

inherit rpm
