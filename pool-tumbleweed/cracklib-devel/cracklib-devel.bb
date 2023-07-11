SUMMARY = "Header files and libraries for developing apps which will use CrackLib"
DESCRIPTION = "The cracklib-devel package contains the header files and libraries \
needed to develop programs that use the CrackLib functions to to \
determine whether passwords match certain security-oriented \
characteristics."
LICENSE = "LGPL-2.1-only"

PV = "2.9.11"

RPM_NAME = "cracklib-devel-2.9.11-1.1.aarch64.rpm"
RPM_HASH = "bf4678e0d7254b3705d732340a4ccb4bd78a9dd5e2b1b1e4005eca467f3ac87f91624ddde07689e9504b81e559874c76f3290641c39f495221b2ddfa502d5b44"

RPROVIDES:${PN} += "cracklib-/usr/include/crack.h \
cracklib-devel"

RDEPENDS:${PN} += "glibc-devel \
libcrack2"

inherit rpm
