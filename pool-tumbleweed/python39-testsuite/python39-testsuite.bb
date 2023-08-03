SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-testsuite-3.9.17-3.1.aarch64.rpm"
RPM_HASH = "1eb5173fc1bfa93fabaf88fc32ab08d3f8c850c024fe3446d8d3cfa8815f583c6ba0de628c8ddc19dc6d81999ce39132693f4af49d8596ac8904e944bd62b228"

RPROVIDES:${PN} += "python39-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python39 \
python39-tk"

inherit rpm
