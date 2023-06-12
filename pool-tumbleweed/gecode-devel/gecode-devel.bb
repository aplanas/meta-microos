SUMMARY = "C++ toolkit for developing constraint-based systems"
DESCRIPTION = "Gecode is an open source C++ toolkit for developing constraint-based \
systems."
LICENSE = "MIT"

PV = "6.3.0~git20211208.6b09bea4"

RPM_NAME = "gecode-devel-6.3.0~git20211208.6b09bea4-1.5.aarch64.rpm"
RPM_HASH = "879752297acac7385a07b1eaa79a628d0708cf225a6baaf7baec7cc774413d7a15736beb2e26ae2354965580c7f4bae36dc991e2e43f80d20455e7ead1d57602"

RPROVIDES:${PN} += "gecode-devel \
gecode-devel(aarch-64)"
RDEPENDS:${PN} += "libgecode51"

inherit rpm
