SUMMARY = "Python library for quantum information and many-body calculations"
DESCRIPTION = "quimb is an easy but fast python library for quantum information and \
many-body calculations, including with tensor networks."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "python39-quimb-1.4.2-3.2.aarch64.rpm"
RPM_HASH = "d4b2def6d665081e944b9617e5927fc60de777ae3353b414bb83391ce2219cb76d99fd476ddf6b4f45dfb9b9342a97a91a2d38b9eb25eb178da8d2b2d9ae3b54"

RPROVIDES:${PN} += "python3.9dist-quimb \
python39-quimb \
python3dist-quimb"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
python-abi \
python39-cytoolz \
python39-numba \
python39-numpy \
python39-opt-einsum \
python39-psutil \
python39-scipy \
python39-tqdm \
update-alternatives"

inherit rpm
