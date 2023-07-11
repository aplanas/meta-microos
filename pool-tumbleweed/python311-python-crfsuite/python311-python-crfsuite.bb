SUMMARY = "Python binding for CRFsuite"
DESCRIPTION = "Python-crfsuite is a python binding to CRFsuite_."
LICENSE = "MIT"

PV = "0.9.9"

RPM_NAME = "python311-python-crfsuite-0.9.9-1.6.aarch64.rpm"
RPM_HASH = "901644434e440460db04e8b921f3befbbd77a69ca01a6f2ceedb3b28527b8e116a1c6c53976ab833b5e7800e4963af3c273ffc9fcbab4bef35b937f4b5488bee"

RPROVIDES:${PN} += "python3-python-crfsuite \
python3.11dist-python-crfsuite \
python311-python-crfsuite \
python3dist-python-crfsuite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
