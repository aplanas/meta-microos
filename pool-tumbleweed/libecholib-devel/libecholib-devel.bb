SUMMARY = "Development files for the EchoLink"
DESCRIPTION = "Development files for the EchoLink communications library"
LICENSE = "GPL-2.0-only"

PV = "1.3.2"

RPM_NAME = "libecholib-devel-1.3.2-5.9.aarch64.rpm"
RPM_HASH = "8a2f96cd002638004939ef497f766b0e2c4cf9c168a6e20df574bab789318f7cf29c16d03d49d5abd4a3f3b48f660d9296d13bafd64181f9cd27319840e9ffda"

RPROVIDES:${PN} += "libecholib-devel \
libecholib-devel(aarch-64)"

RDEPENDS:${PN} += "libecholib1_3"

inherit rpm
