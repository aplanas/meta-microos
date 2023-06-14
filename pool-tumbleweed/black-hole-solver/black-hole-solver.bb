SUMMARY = "The Black Hole Solver Executable"
DESCRIPTION = "This is a solver, written in C, to solve the Solitaire variant called “Black \
Hole” and the one called “All in a Row”. It provides a portable C library, and \
a command line application that after being fed with a layout will emit the \
cards to move."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "black-hole-solver-1.12.0-1.2.aarch64.rpm"
RPM_HASH = "c200efc322db4691a32b2667d12b3fdde1112443036f76df6200336ba432a1d9f9199166861064bada3041e1063fa5c7ec55828ff6612c7496f938e61c42ccef"

RPROVIDES:${PN} += "black-hole-solver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblack-hole-solver.so.1 \
libc.so.6"

inherit rpm
