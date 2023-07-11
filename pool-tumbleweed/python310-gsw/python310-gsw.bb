SUMMARY = "Gibbs Seawater Oceanographic Package of TEOS-10"
DESCRIPTION = "Python implementation of the Thermodynamic Equation of \
Seawater 2010 (TEOS-10)."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.6.16"

RPM_NAME = "python310-gsw-3.6.16-1.6.aarch64.rpm"
RPM_HASH = "fbbda2971d16e3928f35ccf0ebe994d088c5b9fbb181376f11ef0d99197a6f66ac093d2583b5ff182b40fe13cbb9c487a4d8e6c8ed481393d9e4fdb2cccbab4d"

RPROVIDES:${PN} += "python3.10dist-gsw \
python310-gsw \
python3dist-gsw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-numpy"

inherit rpm
