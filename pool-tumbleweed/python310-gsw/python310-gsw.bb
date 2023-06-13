SUMMARY = "Gibbs Seawater Oceanographic Package of TEOS-10"
DESCRIPTION = "Python implementation of the Thermodynamic Equation of \
Seawater 2010 (TEOS-10)."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.6.16"

RPM_NAME = "python310-gsw-3.6.16-1.5.aarch64.rpm"
RPM_HASH = "14e1f67b4b061de84ee279c3ada5fe200ba142bf0d90437d7a4891f3ca2729052b64819f4cc606f2b5b9538568f87742e3ad79cb315ed8afe6e3997601aea601"

RPROVIDES:${PN} += "python3-gsw \
python3.10dist(gsw) \
python310-gsw \
python310-gsw(aarch-64) \
python3dist(gsw)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-numpy"

inherit rpm
