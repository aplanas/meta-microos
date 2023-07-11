SUMMARY = "Python binding for CRFsuite"
DESCRIPTION = "Python-crfsuite is a python binding to CRFsuite_."
LICENSE = "MIT"

PV = "0.9.9"

RPM_NAME = "python310-python-crfsuite-0.9.9-1.6.aarch64.rpm"
RPM_HASH = "3e3a58df804066f5cbec2de57a3934487ce0f9b8f9be4f70fc62ba3e9cf46820164d4c7733e409e6488ad50af4222de25182ed5a67aa467952b33578ec6e34e4"

RPROVIDES:${PN} += "python3.10dist-python-crfsuite \
python310-python-crfsuite \
python3dist-python-crfsuite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
