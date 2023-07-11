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

RPM_NAME = "cross-hppa-gcc13-bootstrap-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "69a14c717d26e0e9bd6a74df37b4852886344262c4e197632135475aca85dec93384f0a92a11f68df789cf0e5914c26757a7d2d4d3e2c4e05f3da551abe92155"

RPROVIDES:${PN} += "cross-hppa-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-hppa-binutils \
update-alternatives"

inherit rpm
