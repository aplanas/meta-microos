SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.11.5"

RPM_NAME = "python311-testsuite-3.11.5-1.2.aarch64.rpm"
RPM_HASH = "0b5dc186d72588b41a4b9556bd47b593e450b58585d561acbcac83fc12d8c279501dd3f9b41fd64c015f9dbffb329569cf37e3dc98ea5715b087d4df71352eb8"

RPROVIDES:${PN} += "python3-testsuite \
python311-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python311 \
python311-tk"

inherit rpm
