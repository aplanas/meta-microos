SUMMARY = "Package providing R-parallel"
DESCRIPTION = "This package provides R-parallel, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-parallel-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "4862543b7a6201b76a944f1fbffe2431c8cc4e83b067b76140ae9b5fd67eccbb4c919513bf58815d83aff336de7eb024c223011bb0c8d5897f7305ee37c51ed8"

RPROVIDES:${PN} += "R-parallel"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
