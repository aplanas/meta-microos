SUMMARY = "SAT solver"
DESCRIPTION = "MiniSat is a comparatively small SAT solver. It can do \
conflict-clause recording, conflict-driven backjumping, VSIDS dynamic \
variable order, two-literal watch scheme, non-clausal constraints \
over boolean variables, and variable elimination style \
simplification."
LICENSE = "MIT"

PV = "2.2.1+20200902"

RPM_NAME = "libminisat2-2.2.1+20200902-3.4.aarch64.rpm"
RPM_HASH = "f0df315646d4ad20a7066df42798d88b85aab5305f2bff096ba98baaecb4cd4d6a0281610d330128a9338aa685e5ff81d6754bc79bee7f5400438cbf1414be48"

RPROVIDES:${PN} += "libminisat.so.2()(64bit) \
libminisat2 \
libminisat2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
