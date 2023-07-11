SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.11.4"

RPM_NAME = "python311-testsuite-3.11.4-1.2.aarch64.rpm"
RPM_HASH = "e6ab43112944b6e033f6a4db1aba97bdff0598c634a28e26fd1bd3c8f16829abd16555be90b056ad2d00a04e3d0a18b3ce38698b0faecddcdb60619dc099c77f"

RPROVIDES:${PN} += "python3-testsuite \
python311-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python311 \
python311-tk"

inherit rpm
