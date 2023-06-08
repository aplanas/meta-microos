SUMMARY = "Development files for FFLAS-FFPACK"
DESCRIPTION = "The FFLAS-FFPACK library provides functionalities for dense linear \
algebra over word size prime finite field. \
 \
This subpackage contains the include files for \
developing against the fflas-ffpack library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.0"

RPM_NAME = "fflas-ffpack-devel-2.5.0-1.5.aarch64.rpm"
RPM_HASH = "998c68e7f14858674f3eba8062c80b1320af4a33f0ca1fb5071158db096d45e2e11cec9f1c0764c3c629d04fb95618fa76d6cbf90c13b25502c65f70a5fb047c"

RPROVIDES:${PN} += "fflas-ffpack-devel fflas-ffpack-devel(aarch-64) pkgconfig(fflas-ffpack)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/pkg-config pkgconfig(givaro)"

inherit rpm
