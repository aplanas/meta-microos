SUMMARY = "Python binding for CRFsuite"
DESCRIPTION = "Python-crfsuite is a python binding to CRFsuite_."
LICENSE = "MIT"

PV = "0.9.9"

RPM_NAME = "python39-python-crfsuite-0.9.9-1.6.aarch64.rpm"
RPM_HASH = "9a5373b5dc5d454fb9be676904deb5fe3252ddc73f7a1b3e99912fded688c3353946ba87aa84249ab95d36bc24f3d48a299722cd02f96732eb907051e631aab0"

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
