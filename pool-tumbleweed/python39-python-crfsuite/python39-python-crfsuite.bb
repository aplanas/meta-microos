SUMMARY = "Python binding for CRFsuite"
DESCRIPTION = "Python-crfsuite is a python binding to CRFsuite_."
LICENSE = "MIT"

PV = "0.9.9"

RPM_NAME = "python39-python-crfsuite-0.9.9-1.4.aarch64.rpm"
RPM_HASH = "8bcecd634d5095751a5491ab16385996c391a909b79171c3b65f1aea298b88e7f076446b49060fc80a607c7191d51c7014e835cd4e7fe02adf967a56f4ad9688"

RPROVIDES:${PN} += "python3.9dist-python-crfsuite \
python39-python-crfsuite \
python3dist-python-crfsuite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
