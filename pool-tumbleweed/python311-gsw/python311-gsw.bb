SUMMARY = "Gibbs Seawater Oceanographic Package of TEOS-10"
DESCRIPTION = "Python implementation of the Thermodynamic Equation of \
Seawater 2010 (TEOS-10)."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.6.16"

RPM_NAME = "python311-gsw-3.6.16-1.6.aarch64.rpm"
RPM_HASH = "05bd66a77e4404902f66ba6cb0188f19cdc34c4a3732b5451f04343584b8d168d8940a9ca779bfb9fe34349227d536415486b855a5052106cd30c4ef7ca97d25"

RPROVIDES:${PN} += "python3-gsw \
python3.11dist-gsw \
python311-gsw \
python3dist-gsw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-numpy"

inherit rpm
