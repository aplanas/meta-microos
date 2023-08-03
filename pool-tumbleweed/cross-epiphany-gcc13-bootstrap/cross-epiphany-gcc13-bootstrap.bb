SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-epiphany-gcc13-bootstrap-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "396e175acbbcdbe8f333b0229bd1237e850b8e0ee9b67bda127e0f9325267bd72dedf56d008fc914b94098f8af1cd2d4b3b9922ea686ed4f8763f328931052f2"

RPROVIDES:${PN} += "cross-epiphany-gcc13-bootstrap \
epiphany-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-epiphany-binutils \
update-alternatives"

inherit rpm
