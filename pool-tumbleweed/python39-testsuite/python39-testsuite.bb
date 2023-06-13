SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "python39-testsuite-3.9.16-8.1.aarch64.rpm"
RPM_HASH = "c070d3462c423e05a8716689022197cbcd15311773d2871f21ce0113744402bca3a4a090f1a66f2b29e185189b61f5b8863004d611a193368391509fe68e1f9a"

RPROVIDES:${PN} += "python39-testsuite \
python39-testsuite(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39 \
python39-tk"

inherit rpm
