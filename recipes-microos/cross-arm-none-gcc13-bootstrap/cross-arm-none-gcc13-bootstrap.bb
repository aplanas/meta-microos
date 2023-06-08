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

PV = "13.0.1+git7231"

RPM_NAME = "cross-arm-none-gcc13-bootstrap-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "f7d3e4a745146dad3d1ffc76cbfd796af498ef7bb8dde87f9dd59bb71758feae00226d59acbeda50b4b1447e46792286c069d02481997997bdb93a1292e797f8"

RPROVIDES:${PN} += "arm-none-eabi-gcc cross-arm-none-gcc13-bootstrap cross-arm-none-gcc13-bootstrap(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-arm-binutils update-alternatives"

inherit rpm
