SUMMARY = "Freecell Solver library"
DESCRIPTION = "This package contains the Freecell Solver library which can be used by some \
programs to solves Freecell and other card games."
LICENSE = "MIT"

PV = "6.8.0"

RPM_NAME = "libfreecell-solver0-6.8.0-1.4.aarch64.rpm"
RPM_HASH = "ebb7a0efe532072bfa9891f7ee1788add5e82d731426c970648121f66aa7a0ed0ab6a6b492eba992c8d5d4e438e459b2807d4c068b9cd8551d14981aac69f43b"

RPROVIDES:${PN} += "libfreecell-solver.so.0 \
libfreecell-solver0"

RDEPENDS:${PN} += "/sbin/ldconfig \
freecell-solver-presets \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
