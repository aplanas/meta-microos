SUMMARY = "Low level tools for XTRX"
DESCRIPTION = "Low level tools for XTRX SDR devices."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "xtrxll-tools-0.0.0+git.20201202-2.7.aarch64.rpm"
RPM_HASH = "8784afa47d5e328299607b0e4adf088050e5903fea281e80300cc9799ab6e054956128b21751cc9c59ee618c22475775848cbca41c9cc8fb4b83f4c61ccbf301"

RPROVIDES:${PN} += "xtrxll-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxtrxll.so.0"

inherit rpm
