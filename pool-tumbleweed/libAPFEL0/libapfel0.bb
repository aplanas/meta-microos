SUMMARY = "A Probability Distribution Function Evolution Library"
DESCRIPTION = "APFEL is a library to perform the combined QCD+QED DGLAP \
evolution of parton distributions. \
 \
This package provides the shared libraries for apfel."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.6"

RPM_NAME = "libAPFEL0-3.0.6-1.17.aarch64.rpm"
RPM_HASH = "0377135806692fd3befd4e1df5d1c31a66d3cd245d551bfd66446c7d4dcac4b494778d7dacd7ef41c70b6323753f9d16c2b009b7dd13c76f8522bc4a342406b7"

RPROVIDES:${PN} += "libAPFEL.so.0 \
libAPFEL0 \
libAPFELevol.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
