SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.8.17"

RPM_NAME = "python38-testsuite-3.8.17-1.2.aarch64.rpm"
RPM_HASH = "7b2548c6f76b3854a3983701250c9c909da2b466b8724c3dc3c2b5062e5c318599fb56ce9b7bb2b4772640da5fc18abf6041aa1c80578d1d1842b44db86061ae"

RPROVIDES:${PN} += "python38-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python38 \
python38-tk"

inherit rpm
