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

RPM_NAME = "cross-arm-none-gcc12-bootstrap-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "f57e895c7886c8a319ec474ef7335446e4a55ad268e65d1b5e78004785e6219f1045d36cba05444f559bd897c0199ca62924c21a0296561fe608393db1abec19"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc12-bootstrap"

RDEPENDS:${PN} += "/bin/sh \
cross-arm-binutils \
update-alternatives"

inherit rpm
