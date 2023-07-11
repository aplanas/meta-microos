SUMMARY = "SAT solver"
DESCRIPTION = "MiniSat is a comparatively small SAT solver with documentation \
(through the following paper). The first version was just above 600 \
lines while containing many then-desirable features (conflict-clause \
recording, conflict-driven backjumping, VSIDS dynamic variable order, \
two-literal watch scheme), and even extensions for incremental SAT \
and for non-clausal constraints over boolean variables. \
 \
The current MiniSat v2 supports variable elimination style \
simplification, too."
LICENSE = "MIT"

PV = "2.2.1+20200902"

RPM_NAME = "minisat-2.2.1+20200902-3.5.aarch64.rpm"
RPM_HASH = "a7c426e04915267f1bfc7558728f73ce9d3a6e85912c94dbae803a9cdb25691bcb2324a6434ffef345af70302e7b49934288459c485f8b7f36e5a5a04f450f16"

RPROVIDES:${PN} += "minisat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libminisat.so.2 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
