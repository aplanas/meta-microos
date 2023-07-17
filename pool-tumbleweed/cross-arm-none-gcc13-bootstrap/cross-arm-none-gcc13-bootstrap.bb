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

PV = "13.1.1+git7552"

RPM_NAME = "cross-arm-none-gcc13-bootstrap-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "22939d8148b0464a956a9750e7c1243cf72b8d10dde3433a2f9d11302842e6a752c2032048349697f0d044266767167ae5442c48c5dfe0c36de0810d6ce0a6a3"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
update-alternatives"

inherit rpm
