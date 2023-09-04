SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.12.0rc1"

RPM_NAME = "python312-testsuite-3.12.0rc1-2.1.aarch64.rpm"
RPM_HASH = "c39f6411dde32dee2a5ae70a03cd04426fd49c3502bf84326900e90b8a4a04dca41223cf0ad50c62b1172280271c60ed37b722c4f791e55ee3d5a43984a30df9"

RPROVIDES:${PN} += "python312-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python312 \
python312-tk"

inherit rpm
