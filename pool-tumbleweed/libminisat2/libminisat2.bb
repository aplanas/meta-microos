SUMMARY = "SAT solver"
DESCRIPTION = "MiniSat is a comparatively small SAT solver. It can do \
conflict-clause recording, conflict-driven backjumping, VSIDS dynamic \
variable order, two-literal watch scheme, non-clausal constraints \
over boolean variables, and variable elimination style \
simplification."
LICENSE = "MIT"

PV = "2.2.1+20200902"

RPM_NAME = "libminisat2-2.2.1+20200902-3.5.aarch64.rpm"
RPM_HASH = "a469ef020d81ba9a29272708a67932be04d79258a688a92055663d40cf68bee255798e09d6f04c70796a5b059292a0de4ac07ea1212b587cbff65a028b860695"

RPROVIDES:${PN} += "libminisat.so.2 \
libminisat2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
