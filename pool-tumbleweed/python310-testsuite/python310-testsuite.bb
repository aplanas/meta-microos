SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-testsuite-3.10.12-3.1.aarch64.rpm"
RPM_HASH = "92578b387b976d597fdf6d9c9d0554180dd45389e15f8236605eceae2a8b7cb8d1428e841869866cab0751e7ddcae7371718616533d66cf5b31430227f3e130b"

RPROVIDES:${PN} += "python310-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python310 \
python310-tk"

inherit rpm
