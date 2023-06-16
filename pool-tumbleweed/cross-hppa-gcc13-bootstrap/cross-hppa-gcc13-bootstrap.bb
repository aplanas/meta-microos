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

PV = "13.1.1+git7364"

RPM_NAME = "cross-hppa-gcc13-bootstrap-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "07fd8723da3bd7be6b86aae9e01b1e5ba4860615db5254ee9e96134c79c9a2af3445ccfccc8164bd32e1db9cb5726d846c8f39992714583c1defdd6153b48b5d"

RPROVIDES:${PN} += "cross-hppa-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-hppa-binutils \
update-alternatives"

inherit rpm
