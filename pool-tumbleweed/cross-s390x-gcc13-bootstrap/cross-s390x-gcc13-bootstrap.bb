SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-s390x-gcc13-bootstrap-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "b5ec51c74ce323ee116cf471fc8e12c5dc0e168335b54cb981bae871c5883568a2471da6fb9028827498515be7c5c309b06dd790fc1611e593a6ef1edcf1cb35"

RPROVIDES:${PN} += "cross-s390x-gcc13-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-s390x-binutils \
update-alternatives"

inherit rpm
