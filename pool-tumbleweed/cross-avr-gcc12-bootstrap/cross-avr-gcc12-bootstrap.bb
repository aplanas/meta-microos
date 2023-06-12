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

PV = "12.3.0+git1204"

RPM_NAME = "cross-avr-gcc12-bootstrap-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "005aa1cc566f4ba165ee534599ea2f1e74b086fd556e205caddccd412554e88b689ec90bcf785ddf2f4310665f1bbfdf38a67a63b330e3ba8119088ddc388152"

RPROVIDES:${PN} += "cross-avr-gcc12-bootstrap \
cross-avr-gcc12-bootstrap(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
cross-avr-binutils \
update-alternatives"

inherit rpm
