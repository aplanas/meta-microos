SUMMARY = "Gibbs Seawater Oceanographic Package of TEOS-10"
DESCRIPTION = "Python implementation of the Thermodynamic Equation of \
Seawater 2010 (TEOS-10)."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.6.16"

RPM_NAME = "python39-gsw-3.6.16-1.5.aarch64.rpm"
RPM_HASH = "24186f23399a1cb7c01114763b2fa2c5985ad47a4ae700a8eac03bb69bbd29b8350c79c02f012530a815d497c5364aca27ef6b2f9a0fa1e6cbaf817056f78156"

RPROVIDES:${PN} += "python3.9dist(gsw) \
python39-gsw \
python39-gsw(aarch-64) \
python3dist(gsw)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-numpy"

inherit rpm
