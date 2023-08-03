SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-testsuite-3.10.12-2.1.aarch64.rpm"
RPM_HASH = "298319ac411676804219eead48bfe69a6bbbcb3d6ea4225a6b0df64171279fdc0c9b1d99d6e1acf2bf63b2ffb3493ed41fba45d62d1b3716b18fa7d4c1fdcd34"

RPROVIDES:${PN} += "python310-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python310 \
python310-tk"

inherit rpm
