SUMMARY = "A make-like build tool using Go"
DESCRIPTION = " \
Mage is a make-like build tool using Go. You write plain-old go functions, and Mage automatically uses them as Makefile-like runnable targets."
LICENSE = "Apache-2.0"

PV = "v1.11.0~git0.07afc7d"

RPM_NAME = "mage-v1.11.0~git0.07afc7d-1.11.aarch64.rpm"
RPM_HASH = "d9bdc57f6fba9d363d3ff6979e4b75b8bfc786b73075b33fb0d107629778c6af521c3414a7cf1ed6b65066074bc5e0268082a4f6286a38556ebdd8e426b1a5d3"

RPROVIDES:${PN} += "mage"

RDEPENDS:${PN} += ""

inherit rpm
