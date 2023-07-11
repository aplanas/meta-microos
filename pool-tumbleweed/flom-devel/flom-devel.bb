SUMMARY = "Distributed lock manager library"
DESCRIPTION = "FLoM is a distributed lock manager that can be used to \
synchronize shell commands, scripts and custom developed software. \
 \
This package contains the files required to build programs with FLoM."
LICENSE = "GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "flom-devel-1.6.1-1.2.aarch64.rpm"
RPM_HASH = "202172faafe526f06729e5a8c039de66579e670198ded72d8c3b8fb7dcb2e567827718b4a572eb84ecc93659af4e6d490348be4de989f68c715699f29d4b2210"

RPROVIDES:${PN} += "flom-devel"

RDEPENDS:${PN} += "libflom0"

inherit rpm
