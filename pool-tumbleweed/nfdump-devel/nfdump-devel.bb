SUMMARY = "Development files for libnfdump"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use libnfdump."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "nfdump-devel-1.7.1-1.3.aarch64.rpm"
RPM_HASH = "a01c1546543616e3634cad5e74d50601c79fe6bc8702cbdbb48847dea3d234a0457eb71dc19dca7c274931956451a0ac3c25c8757f0f7695c6a488b7890239af"

RPROVIDES:${PN} += "nfdump-devel \
nfdump-devel(aarch-64)"

RDEPENDS:${PN} += "libnfdump1_7_1"

inherit rpm
