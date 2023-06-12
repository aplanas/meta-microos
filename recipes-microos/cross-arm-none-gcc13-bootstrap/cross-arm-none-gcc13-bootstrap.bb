SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-arm-none-gcc13-bootstrap-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "78ba04a642fea41dd25e7b360547d027b514a6dfbe54117addd218b5151f71e2343fa47f02c3369ace0b283aa8ddbc5344c1de87fb1303a603094ce778027fd9"

RPROVIDES:${PN} += "arm-none-eabi-gcc cross-arm-none-gcc13-bootstrap cross-arm-none-gcc13-bootstrap(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-arm-binutils update-alternatives"

inherit rpm
