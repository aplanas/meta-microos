SUMMARY = "LSC Algorithm Simulation Library"
DESCRIPTION = "The LSC Algorithm Simulation Library for gravitational wave data analysis. This \
package contains the shared-object libraries needed to run applications \
that use the LAL Simulation library."
LICENSE = "GPL-2.0-only"

PV = "4.0.0"

RPM_NAME = "python310-lalsimulation-4.0.0-2.1.aarch64.rpm"
RPM_HASH = "06224e3eef5be992ef9dcef4110af181083034ea43a05df0625c161119cf61b1d07a02cf6f4b70ab2dd4141a64a1b2563ebb77bc69f254b11109946f2f0b0f24"

RPROVIDES:${PN} += "python3-lalsimulation \
python310-lalsimulation"

RDEPENDS:${PN} += "lalsimulation-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalsimulation.so.31 \
liblalsupport.so.14 \
python-abi \
python310-lal \
python310-numpy"

inherit rpm
