SUMMARY = "LSC Algorithm Simulation Library"
DESCRIPTION = "The LSC Algorithm Simulation Library for gravitational wave data analysis. This \
package contains the shared-object libraries needed to run applications \
that use the LAL Simulation library."
LICENSE = "GPL-2.0-only"

PV = "4.0.0"

RPM_NAME = "python38-lalsimulation-4.0.0-2.1.aarch64.rpm"
RPM_HASH = "2c1ff5ad76a8b9e57661b6794ef73a0e3bfc388f5f50eb68c74bbd1b94064cbdf80ec3116e1417cda20cd64bc2383f65b76a19d1799d198b98ad4d1f7b8340bd"

RPROVIDES:${PN} += "python38-lalsimulation"

RDEPENDS:${PN} += "lalsimulation-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalsimulation.so.31 \
liblalsupport.so.14 \
python-abi \
python38-lal \
python38-numpy"

inherit rpm
