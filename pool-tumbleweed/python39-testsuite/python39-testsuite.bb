SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.9.18"

RPM_NAME = "python39-testsuite-3.9.18-1.1.aarch64.rpm"
RPM_HASH = "d6fed63ef1a8875cc20042e9b799e7c7a8f504c1cbcd0c501361c704ade2a9d5f31c38a409e25230694d9932c91b06721b4f29502e2707869b90840775b98f74"

RPROVIDES:${PN} += "python39-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python39 \
python39-tk"

inherit rpm
