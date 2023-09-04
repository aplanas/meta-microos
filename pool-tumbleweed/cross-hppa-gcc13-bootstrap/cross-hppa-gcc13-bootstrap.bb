SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-hppa-gcc13-bootstrap-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "47df84c7ca9a6a0c610bb1392184322f38cee15cb5f077f1ab8efa10a216e0522c5706e548412fa58764ffaac0c222dab8dc364b2c0f2c55b80d1e538c041584"

RPROVIDES:${PN} += "cross-hppa-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-hppa-binutils \
update-alternatives"

inherit rpm
