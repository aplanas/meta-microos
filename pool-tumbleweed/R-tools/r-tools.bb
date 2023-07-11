SUMMARY = "Package providing R-tools"
DESCRIPTION = "This package provides R-tools, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-tools-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "d2d8065bc4f8d1286d3a68a4b92756140e10973e5b901e0d327953feca40a3b946e41d9d63e716f0f55f2d8451d34ce03810b57efaaf35eec7f57560e57109ee"

RPROVIDES:${PN} += "R-tools"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
