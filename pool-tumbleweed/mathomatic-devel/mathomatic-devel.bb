SUMMARY = "Development Package for Mathomatic"
DESCRIPTION = "This package contains the Mathomatic symbolic math library, for using the \
Mathomatic code inside of any C compatible program.  This is a static \
library only, with no dependencies or requirements.  It has a small, easy \
to use API that is written in C.  The Mathomatic code is not re-entrant."
LICENSE = "LGPL-2.1-or-later"

PV = "16.0.5"

RPM_NAME = "mathomatic-devel-16.0.5-1.14.aarch64.rpm"
RPM_HASH = "84cc9ea6d4cc9b3a2c70464171535eac45986948c80382bc93a62e00fc60ca2f24877de295535e61bc77df53c396490a8b39a206590a7912e328d98b7efad261"

RPROVIDES:${PN} += "mathomatic-devel"

RDEPENDS:${PN} += ""

inherit rpm
