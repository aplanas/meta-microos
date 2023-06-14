SUMMARY = "Watches a path and runs a command whenever it detects modifications."
DESCRIPTION = "A simple, standalone tool that watches a path and runs a command \
whenever it detects modifications."
LICENSE = "Apache-2.0"

PV = "1.22.3"

RPM_NAME = "watchexec-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "48893eca95d95e2b458c4e3667ef8d7467ad1f3b77dd02aaaa2063025d74bb1c820c198c3c2acc11ad375d4b60aeb8ccb03bb60d67a70c2d24e33e58243b7a93"

RPROVIDES:${PN} += "bundled-rust-crate-BROKEN \
watchexec"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
