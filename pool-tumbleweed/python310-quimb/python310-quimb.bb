SUMMARY = "Python library for quantum information and many-body calculations"
DESCRIPTION = "quimb is an easy but fast python library for quantum information and \
many-body calculations, including with tensor networks."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "python310-quimb-1.4.2-3.2.aarch64.rpm"
RPM_HASH = "6931ebdd5cf70a7f6eff478336d05e6cc8ad35d5fc0aa1c4c5c7cc53e9b38be1594016d37987dc4c28e37c5cd5a192eceef5706a2a0d03569a8c46245ddafcc5"

RPROVIDES:${PN} += "python3-quimb \
python3.10dist-quimb \
python310-quimb \
python3dist-quimb"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
python-abi \
python310-cytoolz \
python310-numba \
python310-numpy \
python310-opt-einsum \
python310-psutil \
python310-scipy \
python310-tqdm \
update-alternatives"

inherit rpm
