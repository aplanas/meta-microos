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

RPM_NAME = "minisat-2.2.1+20200902-3.4.aarch64.rpm"
RPM_HASH = "85aeeb1e0f3f3c6b8bc4bc72ea7ae06e5a0818e19e70cc0fba4ddd1ec676f848c6f4f79f5d4998b69e33ef1fb193afa9fda5faefc2bbfec30b9e0e98f15f16ed"

RPROVIDES:${PN} += "minisat \
minisat(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libminisat.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libz.so.1()(64bit)"

inherit rpm