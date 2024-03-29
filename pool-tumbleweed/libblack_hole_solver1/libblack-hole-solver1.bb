SUMMARY = "Solitaire Solver dynamic libraries"
DESCRIPTION = "Contains the Black Hole Solitaire dynamic library."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "libblack_hole_solver1-1.12.0-1.2.aarch64.rpm"
RPM_HASH = "058efbfb3917f7cd9cae83e2a045561ac6cdce54a8f8bcc4ee75737f516c606ea34062e2605c987ee72e62ecb05bbb06f1deebf2be0c9bc1b8abdfd97794e9e2"

RPROVIDES:${PN} += "libblack-hole-solver.so.1 \
libblack-hole-solver1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxxhash.so.0"

inherit rpm
