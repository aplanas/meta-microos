SUMMARY = "LSC Algorithm Simulation Library"
DESCRIPTION = "The LSC Algorithm Simulation Library for gravitational wave data analysis. This \
package contains the shared-object libraries needed to run applications \
that use the LAL Simulation library."
LICENSE = "GPL-2.0-only"

PV = "4.0.0"

RPM_NAME = "python39-lalsimulation-4.0.0-2.1.aarch64.rpm"
RPM_HASH = "c3eaa83b85e50837a9e9478aa88966a35b4e4375a7360406a0e30e081f96f4362ee961b53004e1cbe8e287c9deaf087ef700f8d2d82aea46f86565304d56d399"

RPROVIDES:${PN} += "python39-lalsimulation"

RDEPENDS:${PN} += "lalsimulation-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalsimulation.so.31 \
liblalsupport.so.14 \
python-abi \
python39-lal \
python39-numpy"

inherit rpm
