SUMMARY = "A utility for running arbitrary commands when files change"
DESCRIPTION = "A utility for running arbitrary commands when files change. Uses \
inotify(7) to avoid polling."
LICENSE = "ISC"

PV = "5.4"

RPM_NAME = "entr-5.4-1.1.aarch64.rpm"
RPM_HASH = "9b961b39e2a54c5fcc78ace4803f5c85a6c9b4d3eed6599d3bb989e514bed0af77b49495fc43b492c58a8cc2026d13bceba0c08e979e95912470c2ca97155a60"

RPROVIDES:${PN} += "entr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
