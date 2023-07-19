SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.12.0b4"

RPM_NAME = "python312-testsuite-3.12.0b4-1.1.aarch64.rpm"
RPM_HASH = "26cd0607ece805c861e2d5f4ac7b0acc7718ab65dd6c3a54cde62527c6b902c2b95018112d6f487481c7a51a90828114d93df6d7dcdd6e846ae90f42a1c25b98"

RPROVIDES:${PN} += "python312-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python312 \
python312-tk"

inherit rpm
