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

PV = "11.3.1+git2076"

RPM_NAME = "cross-arm-none-gcc11-bootstrap-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "0bf24727436b7da5e4419b4ebe0624a13a226b38c4daa02abb34ef0e1244694bc5e18e0cb5fa47ac4cf92f878cfac8c72557ccb53bb360f3ea2c37a96a59a104"

RPROVIDES:${PN} += "arm-none-eabi-gcc cross-arm-none-gcc11-bootstrap cross-arm-none-gcc11-bootstrap(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-arm-binutils update-alternatives"

inherit rpm
