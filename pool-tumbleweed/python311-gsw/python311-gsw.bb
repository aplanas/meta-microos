SUMMARY = "Gibbs Seawater Oceanographic Package of TEOS-10"
DESCRIPTION = "Python implementation of the Thermodynamic Equation of \
Seawater 2010 (TEOS-10)."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.6.16"

RPM_NAME = "python311-gsw-3.6.16-1.5.aarch64.rpm"
RPM_HASH = "486eee0a3ed36b05a7cc78562466fdeb5cffd0db5c8719836a8aada2910ca809e0b0f51ad212dd4947508e819e1e50e7c7f0c01eaad00e034cca4946b92c883b"

RPROVIDES:${PN} += "python3.11dist-gsw \
python311-gsw \
python3dist-gsw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-numpy"

inherit rpm
