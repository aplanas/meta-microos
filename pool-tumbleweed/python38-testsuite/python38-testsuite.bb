SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.8.18"

RPM_NAME = "python38-testsuite-3.8.18-1.1.aarch64.rpm"
RPM_HASH = "a596e7647738f79cd3faf849a1b1de3b2fb2a2bef793c2b88e41549abfe6701fab7961567c4d334856f6b2455b0fd754174588656f5c644e04725e4ada2fbc76"

RPROVIDES:${PN} += "python38-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python38 \
python38-tk"

inherit rpm
