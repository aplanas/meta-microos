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

PV = "13.1.1+git7597"

RPM_NAME = "cross-hppa-gcc13-bootstrap-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "24e232facec6e1658045368a61af7b4cd816f7aa6de37aff5c19d7a2d53f8e8699f525ee233d40746c83d4358734cd7eceda11770307b12008c96a2e623cf518"

RPROVIDES:${PN} += "cross-hppa-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-hppa-binutils \
update-alternatives"

inherit rpm
