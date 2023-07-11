SUMMARY = "Gibbs Seawater Oceanographic Package of TEOS-10"
DESCRIPTION = "Python implementation of the Thermodynamic Equation of \
Seawater 2010 (TEOS-10)."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.6.16"

RPM_NAME = "python39-gsw-3.6.16-1.6.aarch64.rpm"
RPM_HASH = "700929ced6c0ab92b8b8002e4c7ae23e1b58044f33ffeaf65345dfd197b3caa7500b504e46fc176ce3cbe20279d5f861c15ac7ed9cc135d259587db2151514f1"

RPROVIDES:${PN} += "python3.9dist-gsw \
python39-gsw \
python3dist-gsw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-numpy"

inherit rpm
