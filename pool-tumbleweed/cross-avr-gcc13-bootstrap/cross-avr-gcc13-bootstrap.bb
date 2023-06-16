SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-avr-gcc13-bootstrap-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "7d970bfb161e5699b49c7ac3d1e4c2c0a05a8f34166cf7fdb242e837cac7775ecbdcddc357e7b9da0427a037175399867235fad326316fa23fb776a3cba81695"

RPROVIDES:${PN} += "cross-avr-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-avr-binutils \
update-alternatives"

inherit rpm
