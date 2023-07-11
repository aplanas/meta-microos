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

PV = "12.3.0+git1204"

RPM_NAME = "cross-arm-none-gcc12-bootstrap-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "dd01e879f0582c04c314b0f47b850e31357965009cecfe308c48ac53e527b098c40de76797a61104e7c0d474b0dddb29e4d6791b27a151e58ab58bafa211fc4e"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc12-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
update-alternatives"

inherit rpm
