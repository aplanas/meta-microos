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

PV = "13.1.1+git7552"

RPM_NAME = "cross-hppa-gcc13-bootstrap-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "25b7879ff017a6c125e2bbc8649dddad11878b46718523208565067abe2f9b02cc68ea5515110f5096abe5fd9aa7dd43dbba2946137bf9f2bab1862040642783"

RPROVIDES:${PN} += "cross-hppa-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-hppa-binutils \
update-alternatives"

inherit rpm
