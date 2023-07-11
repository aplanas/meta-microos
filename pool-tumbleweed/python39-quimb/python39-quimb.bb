SUMMARY = "Python library for quantum information and many-body calculations"
DESCRIPTION = "quimb is an easy but fast python library for quantum information and \
many-body calculations, including with tensor networks."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "python39-quimb-1.4.2-4.1.aarch64.rpm"
RPM_HASH = "62e8c4e9fd2e67408ac3786eee1071043cfd7f7d9ff3cd3416e38b622b438873e34ea41e48425e12e456af3ea693e29b50367a9c208e46598dcb2983340a3513"

RPROVIDES:${PN} += "python3.9dist-quimb \
python39-quimb \
python3dist-quimb"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
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
