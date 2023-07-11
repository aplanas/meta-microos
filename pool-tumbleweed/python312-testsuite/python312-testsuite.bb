SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.12.0b3"

RPM_NAME = "python312-testsuite-3.12.0b3-1.2.aarch64.rpm"
RPM_HASH = "1cab5554f42eb011ca338ed3fc84a1797b69e0c558e5bf9c6cde4cb75b5cb7485008f01b7f250c22a89ceec07289e814d3e0fab15df413aa2c48a167e8001433"

RPROVIDES:${PN} += "python312-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python312 \
python312-tk"

inherit rpm
