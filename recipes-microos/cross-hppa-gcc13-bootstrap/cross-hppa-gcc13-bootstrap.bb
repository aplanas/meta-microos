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

PV = "13.0.1+git7231"

RPM_NAME = "cross-hppa-gcc13-bootstrap-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "3304f419beb36c1cbb32a7180fa4e7611183321bd103ace63feb66c475204c563a94e44b8b7dbcb2197d4d21a5df7b216234d32ab8c6cfdd7ff96cf18accdb53"

RPROVIDES:${PN} += "cross-hppa-gcc13-bootstrap cross-hppa-gcc13-bootstrap(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-hppa-binutils update-alternatives"

inherit rpm
