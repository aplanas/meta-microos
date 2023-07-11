SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-testsuite-3.9.17-1.1.aarch64.rpm"
RPM_HASH = "e2d3cb9204bc84318e08bbb286639793305a5b22012535245fa3bffcacaf77a2a3c7a8d8078f52eb29cd6ce1b8c04431839830c8cab507b3c4c06af41272c9f4"

RPROVIDES:${PN} += "python39-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python39 \
python39-tk"

inherit rpm
