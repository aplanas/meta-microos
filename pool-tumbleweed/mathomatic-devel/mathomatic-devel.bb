SUMMARY = "Development Package for Mathomatic"
DESCRIPTION = "This package contains the Mathomatic symbolic math library, for using the \
Mathomatic code inside of any C compatible program.  This is a static \
library only, with no dependencies or requirements.  It has a small, easy \
to use API that is written in C.  The Mathomatic code is not re-entrant."
LICENSE = "LGPL-2.1-or-later"

PV = "16.0.5"

RPM_NAME = "mathomatic-devel-16.0.5-1.13.aarch64.rpm"
RPM_HASH = "27f5b562b3107289952a9f10da46bd68aae66e2fcc3532990118b08c636b1d558575a7e482aeae34b4ea1ceb517af99599ee9c0dbe6e699c3023fa6208439bea"

RPROVIDES:${PN} += "mathomatic-devel \
mathomatic-devel(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
