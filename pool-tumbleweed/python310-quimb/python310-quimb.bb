SUMMARY = "Python library for quantum information and many-body calculations"
DESCRIPTION = "quimb is an easy but fast python library for quantum information and \
many-body calculations, including with tensor networks."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "python310-quimb-1.4.2-4.1.aarch64.rpm"
RPM_HASH = "7768fd70c9380d5585ab06a355052963c3ead829ec12703bbb62cc729ed85bcb5bf19a3502002360072f00c01ef4e3485b92830b62fa3b2e81ba0edb3e56a929"

RPROVIDES:${PN} += "python3.10dist-quimb \
python310-quimb \
python3dist-quimb"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
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
