SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.11.4"

RPM_NAME = "python311-testsuite-3.11.4-3.1.aarch64.rpm"
RPM_HASH = "20bc463f71d67314938455340a4227f2ba1469baff1aa25e2d53c6044ca7bc86b954fbdeb233fcec5a543b0f3022d7c4428e0bbf44e17e589277e87c4fb9ccaf"

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
