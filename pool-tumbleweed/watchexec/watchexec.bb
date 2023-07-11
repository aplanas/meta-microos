SUMMARY = "Watches a path and runs a command whenever it detects modifications."
DESCRIPTION = "A simple, standalone tool that watches a path and runs a command \
whenever it detects modifications."
LICENSE = "Apache-2.0"

PV = "1.22.3"

RPM_NAME = "watchexec-1.22.3-1.2.aarch64.rpm"
RPM_HASH = "a2bb6c52fd2d26e6ad18679de48a774e82e1509558883c9490be6ef4e71eb5a39a07e1201ba5c3d8c1e6d7c3b4d19655a9130d8aca9084bc8d947846f09d54ac"

RPROVIDES:${PN} += "bundled-rust-crate-BROKEN \
watchexec"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
