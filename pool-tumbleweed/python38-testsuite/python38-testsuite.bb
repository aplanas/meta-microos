SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.8.17"

RPM_NAME = "python38-testsuite-3.8.17-2.1.aarch64.rpm"
RPM_HASH = "97823025d146ee229c58f059e342be4172198375321312034ae42aaa6c5646426ad6668cc3cd2df2943117201f914710835e9a46f35887e3a6a40f01545736f2"

RPROVIDES:${PN} += "python38-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python38 \
python38-tk"

inherit rpm
