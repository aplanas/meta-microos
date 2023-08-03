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

PV = "13.1.1+git7597"

RPM_NAME = "cross-arm-none-gcc13-bootstrap-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "da892fe213fca00c8db3be363c77a5d8732ff01aa91a9f69af6f832af3c2f14e67e352223f6aef2570472c46c0d5188cc59ea5d9f84f48616429d169714d81a5"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
update-alternatives"

inherit rpm
