SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-testsuite-3.9.17-4.1.aarch64.rpm"
RPM_HASH = "59f884394b6a7a4c0857d8f14e64b9793f426cf786e292cbe4a9f6043677abb450733a39fb85742a252c9fb5d5993c45a4208d9e40fc9edd457e4d09242dd764"

RPROVIDES:${PN} += "python39-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python39 \
python39-tk"

inherit rpm
