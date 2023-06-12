SUMMARY = "Header files and libraries for developing apps which will use CrackLib"
DESCRIPTION = "The cracklib-devel package contains the header files and libraries \
needed to develop programs that use the CrackLib functions to to \
determine whether passwords match certain security-oriented \
characteristics."
LICENSE = "LGPL-2.1-only"

PV = "2.9.8"

RPM_NAME = "cracklib-devel-2.9.8-1.2.aarch64.rpm"
RPM_HASH = "4b45bb8e68c8ce2e06c0ab7fbbf483f2650e0eb6dd9ac2b42b61f5c70f19ce655f298c0752bcddcb3dc37a6098735fa96c463a1b013eb1c26908df9a39587ecc"

RPROVIDES:${PN} += "cracklib-devel \
cracklib-devel(aarch-64) \
cracklib:/usr/include/crack.h"
RDEPENDS:${PN} += "glibc-devel \
libcrack2"

inherit rpm
