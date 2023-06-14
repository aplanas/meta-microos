SUMMARY = "Python binding for CRFsuite"
DESCRIPTION = "Python-crfsuite is a python binding to CRFsuite_."
LICENSE = "MIT"

PV = "0.9.9"

RPM_NAME = "python311-python-crfsuite-0.9.9-1.4.aarch64.rpm"
RPM_HASH = "0a0bdd653762ed33c03425cf0378af309e8a8b05e2a71be1ab49d8e04333bf6bc0b8be9050b028247eaee65ec41fa373f91e9742e10a40a74903ba3ca8dacd31"

RPROVIDES:${PN} += "python3.11dist-python-crfsuite \
python311-python-crfsuite \
python3dist-python-crfsuite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
