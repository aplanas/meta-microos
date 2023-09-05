SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-ppc64le-gcc13-bootstrap-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "f38cf02a65a832209d817a6af28f5858c084a0702cef89301a82bede7d72e2ca50928f2eda6efe0cfb918f36571bd95eaa0d244cdc2c6c3f981c6d51dcdc5431"

RPROVIDES:${PN} += "cross-ppc64le-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-ppc64le-binutils \
update-alternatives"

inherit rpm
